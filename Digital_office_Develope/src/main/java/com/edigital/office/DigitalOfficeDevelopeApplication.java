package com.edigital.office;

import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DigitalOfficeDevelopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalOfficeDevelopeApplication.class, args);
	}

	@Bean
	public Mapper dozerBean() {
		List<String> mappingFiles = Arrays.asList("digitalOfficeMapping.xml");
		DozerBeanMapper dozerBean = new DozerBeanMapper();
		dozerBean.setMappingFiles(mappingFiles);
		return dozerBean;
	}

}
