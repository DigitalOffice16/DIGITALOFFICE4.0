package com.digital.office.securityconfig;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
@Component
public class TokenProvider {
	private final Logger log = LoggerFactory.getLogger(TokenProvider.class);

    private static final String AUTHORITIES_KEY = "auth";

    @Value("${security.authentication.jwt.tokenSecret}")
    private String secretKey;

    @Value("${security.authentication.jwt.tokenShortValidity}")
    private long tokenValidityInSeconds;

    @Value("${security.authentication.jwt.tokenValidityRememberMe}")
    private long tokenValidityInSecondsForRememberMe;

    public  Map<String,String> createToken(Authentication authentication, Boolean rememberMe) {
        String authorities = authentication.getAuthorities().stream()
            .map(authority -> authority.getAuthority())
            .collect(Collectors.joining(","));
        
        Map<String,String> hmap=new HashMap<>();

        long now = (new Date()).getTime();
        Date validity = new Date(now);
        if (rememberMe) {
            validity = new Date(now + this.tokenValidityInSecondsForRememberMe);
        } else {
            validity = new Date(now + this.tokenValidityInSeconds);
        }
        
        hmap.put("token", Jwts.builder()
            .setSubject(authentication.getName())
            .claim(AUTHORITIES_KEY, authorities)
            .signWith(SignatureAlgorithm.HS512, secretKey)
            .setExpiration(validity)
            .compact());
        hmap.put("validity", validity.toString());

        return hmap;
    }

    public Authentication getAuthentication(String token) {
        Claims claims = Jwts.parser()
            .setSigningKey(secretKey)
            .parseClaimsJws(token)
            .getBody();

        String principal = claims.getSubject();

        Collection<? extends GrantedAuthority> authorities =
            Arrays.asList(claims.get(AUTHORITIES_KEY).toString().split(",")).stream()
                .map(authority -> new SimpleGrantedAuthority(authority))
                .collect(Collectors.toList());

        return new UsernamePasswordAuthenticationToken(principal, "", authorities);
    }

    public boolean validateToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(authToken);
            return true;
        } catch (UnsupportedJwtException e) {
            log.info("Invalid JWT token: " + e.getMessage());
            return false;
        }
    }
}
