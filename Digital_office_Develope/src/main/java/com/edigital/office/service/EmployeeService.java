package com.edigital.office.service;

import org.springframework.stereotype.Service;

import com.edigital.office.model.dto.AddressDto;
import com.edigital.office.model.dto.EmployeeDetailDto;
@Service
public interface EmployeeService {
    public EmployeeDetailDto createEmployee(EmployeeDetailDto employeeDetailDto) ;
    
    public void createAddress(AddressDto addressDto,String createdBy) ;
}
