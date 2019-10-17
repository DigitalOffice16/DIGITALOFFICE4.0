package com.edigital.office.service.impl;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.edigital.office.dao.repository.EmployeeAddressRepository;
import com.edigital.office.dao.repository.EmployeeDetailRepository;
import com.edigital.office.model.dao.EmployeeAddress;
import com.edigital.office.model.dao.EmployeeDetail;
import com.edigital.office.model.dto.AddressDto;
import com.edigital.office.model.dto.EmployeeDetailDto;
import com.edigital.office.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDetailRepository employeeDetailRepository;
	@Autowired
	Mapper mapper;
	@Autowired
	EmployeeAddressRepository employeeAddressRepository;

	@Override
	public EmployeeDetailDto createEmployee(EmployeeDetailDto employeeDetailDto) {

		EmployeeDetail employeeDetail = null;
		employeeDetail = mapper.map(employeeDetailDto, EmployeeDetail.class);
		employeeDetail.setCreatedBy(SecurityContextHolder.getContext().getAuthentication().getName());
		employeeDetail = employeeDetailRepository.save(employeeDetail);
		EmployeeDetailDto dto = mapper.map(employeeDetail, EmployeeDetailDto.class, "persit");
		return dto;
	}
 
	@Override
	public void createAddress(AddressDto addressDto,String createdBy) {
		EmployeeAddress ea=mapper.map(addressDto, EmployeeAddress.class);
		ea.setCreatedBy(createdBy);
	    employeeAddressRepository.save(ea);
	}

}
