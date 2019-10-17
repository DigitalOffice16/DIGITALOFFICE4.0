package com.edigital.office.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edigital.office.model.dto.AddressDto;
import com.edigital.office.model.dto.EmployeeDetailDto;
import com.edigital.office.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeControler {
	@Autowired
	EmployeeService employeeService;
     @RequestMapping(value="/createEmployee" ,method = RequestMethod.POST)
	public ResponseEntity<EmployeeDetailDto> createEmployee(@RequestBody EmployeeDetailDto employeeDetailDto) {
		
		return ResponseEntity.ok(employeeService.createEmployee(employeeDetailDto));
	}
     @RequestMapping(value="/createAddress" ,method = RequestMethod.POST)
     public ResponseEntity<?> createEmployeeAddress(@RequestBody AddressDto addressDto){
    	 
    	 employeeService.createAddress(addressDto ,SecurityContextHolder.getContext().getAuthentication().getName());
    	 return ResponseEntity.ok().build();
     }
}