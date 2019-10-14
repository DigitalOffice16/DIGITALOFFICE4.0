package com.edigital.office.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.edigital.office.dao.repository.UserRepository;
import com.edigital.office.model.dao.Role;
import com.edigital.office.model.dao.User;
import com.edigital.office.model.dto.OfficeUserDto;
import com.edigital.office.util.EdigitalOfficeUtil;


@Service
public class UserServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository UserRepository;
	
	@Autowired
	Mapper mapper;

	//@Autowired
	//private BCryptPasswordEncoder bcryptEncoder;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = UserRepository.findByUserName(username);
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), getAuthority(user));
	}

	private Set<SimpleGrantedAuthority> getAuthority(User user) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		user.getRoles().forEach(role -> {
			//authorities.add(new SimpleGrantedAuthority(role.getName()));
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
		});
		return authorities;
		//return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	/*public List<User> findAll() {
		List<User> list = new ArrayList<>();
		userDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(long id) {
		userDao.deleteById(id);
	}

	@Override
	public User findOne(String username) {
		return userDao.findByUsername(username);
	}

	@Override
	public User findById(Long id) {
		return userDao.findById(id).get();
	}*/

	
    public User save(OfficeUserDto officeUserDto) {
    	User newUser = mapper.map(officeUserDto, User.class);
	   // User newUser = new User();
	    //newUser.setUserName(officeUserDto.getUserName());
	    newUser.setPassword(getEncoder().encode(officeUserDto.getPassword()));
		//newUser.setFirstName(officeUserDto.getFirstName());;
		//newUser.setLastName(officeUserDto.getLastName());
		newUser.setStatus("1");
		List<Role> roles=new ArrayList<Role>();
		officeUserDto.getRoles().forEach(p->{
			Role role=new Role();
			role.setId(EdigitalOfficeUtil.Role.valueOf(p).getId());
		    role.setDescription(EdigitalOfficeUtil.Role.valueOf(p).getDesc());
		    role.setName(p);
		    roles.add(role);
		});
		newUser.setCreatedBy("admin");
		newUser.setRoles(roles);
        return UserRepository.save(newUser);
    }
    public List<User> findAll() {
    	return UserRepository.findAll();
    }
    @Bean
	PasswordEncoder getEncoder() {
	    return new BCryptPasswordEncoder();
	}
}
