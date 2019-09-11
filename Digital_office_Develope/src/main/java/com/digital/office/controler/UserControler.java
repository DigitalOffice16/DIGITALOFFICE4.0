package com.digital.office.controler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.digital.office.dao.repository.UserRepository;
import com.digital.office.exception.BadCredentialsException;
import com.digital.office.model.dao.Role;
import com.digital.office.model.dao.User;
import com.digital.office.model.dto.LoginDTO;
import com.digital.office.model.dto.LoginOutput;
import com.digital.office.securityconfig.JWTConfigurer;
import com.digital.office.service.UserService;

@RestController
public class UserControler {
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserService userService;
	@RequestMapping(value = "/createuser", method = RequestMethod.GET)
	public ResponseEntity<String> creteUser() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Custom-Header", "foo");
		User user = new User();
		user.setCreatedBy("Ranjit");
		user.setFirstName("Ranjit");
		user.setLastName("Barick");
		user.setEmailId("ranjit@gmai.com");
		user.setStatus("Active");
		user.setPassword("rane54f");
		user.setLastModifiedBy("ran");
		List<Role> roles = new ArrayList<>();
		Role role = new Role();
		role.setRoleName("ADMIN");
		role.setCreatedBy("ran");
		Role role1 = new Role();
		role1.setRoleName("EMP");
		role1.setCreatedBy("ran45");
		roles.add(role);
		roles.add(role1);
		user.setRoles(roles);
		userRepository.save(user);
		return new ResponseEntity<String>("Custom header set", headers, HttpStatus.OK);
	}
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<LoginOutput> authenticate(@RequestBody @Valid LoginDTO loginDTO) {
		try {
			HttpHeaders headers = new HttpHeaders();

			DateFormat safdate = new SimpleDateFormat("MM/dd/yyyy");
			Map<String, String> hmap = userService.authenticate(loginDTO);
			LoginOutput loginOutput = new LoginOutput();
			Date date = new Date();
			DateFormat time = new SimpleDateFormat("hh:mm:ss a");
			loginOutput.setTokenId(hmap.get("token"));
			loginOutput.setExpiryDate(safdate
					.format(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy").parse(hmap.get("validity")).getTime()));
			loginOutput.setExpiryTime(time.format(date));
			headers.setBearerAuth(hmap.get("token"));
			headers.set(JWTConfigurer.AUTHORIZATION_HEADER, "Bearer " + hmap.get("token"));
			return new ResponseEntity<LoginOutput>(loginOutput, headers, HttpStatus.OK);

		} catch (BadCredentialsException e) {

			return new ResponseEntity<LoginOutput>(null, null, HttpStatus.UNAUTHORIZED);

		} catch (Exception e2) {

			return new ResponseEntity<LoginOutput>(null, null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
