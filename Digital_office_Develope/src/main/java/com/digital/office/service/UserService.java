package com.digital.office.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.digital.office.dao.repository.UserRepository;
import com.digital.office.exception.BadCredentialsException;
import com.digital.office.model.dao.User;
import com.digital.office.model.dto.LoginDTO;
import com.digital.office.securityconfig.TokenProvider;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	private TokenProvider tokenProvider;
	@Transactional(noRollbackFor = BadCredentialsException.class)
	public Map<String, String> authenticate(@Valid LoginDTO loginDTO) {
		User user = null;
		if (null != loginDTO.getEmailId()) {
			user = userRepository.findByEmailId(loginDTO.getEmailId());
		}
		if (user == null || "No".equalsIgnoreCase(user.getStatus()))
			throw new BadCredentialsException("Not an Authenticated User");
		List<GrantedAuthority> grantedRoles = user.getRoles().stream()
				.map(p -> new SimpleGrantedAuthority(p.getRoleName())).collect(Collectors.toList());
		Authentication authentication = new UsernamePasswordAuthenticationToken(user.getUserId(), "",
				grantedRoles);
		Map<String,String> hmap = tokenProvider.createToken(authentication, false);
		return hmap;
	}
}
