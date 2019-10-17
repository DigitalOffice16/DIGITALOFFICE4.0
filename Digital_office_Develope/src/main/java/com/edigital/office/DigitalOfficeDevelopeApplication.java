package com.edigital.office;

import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

@SpringBootApplication@EnableAsync
public class DigitalOfficeDevelopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalOfficeDevelopeApplication.class, args);
	}

	@Bean	
	public Mapper dozerBean() {
		List<String> mappingFiles = Arrays.asList("mapper/digitalOfficeMapping.xml");
		DozerBeanMapper dozerBean = new DozerBeanMapper();
		dozerBean.setMappingFiles(mappingFiles);
		dozerBean.getMappingMetadata();
		return dozerBean;
	}
	@Bean
	public SecurityContext getSecurityContext() {
		return SecurityContextHolder.getContext();
	}

}
