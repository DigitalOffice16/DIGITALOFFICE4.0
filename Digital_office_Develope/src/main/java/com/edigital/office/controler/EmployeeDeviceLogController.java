package com.edigital.office.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edigital.office.model.dao.EmployeeDeviceLog;
import com.edigital.office.model.dto.EmployeeDeviceLogDto;
import com.edigital.office.model.dto.LoginUserDto;
import com.edigital.office.service.EmployeeDeviceLogs;

@RestController
@RequestMapping("/deviceLog")
public class EmployeeDeviceLogController {
	@Autowired
	EmployeeDeviceLogs employeeDeviceLogs;
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeDeviceLogDto>> register() throws AuthenticationException {
		return ResponseEntity.ok().body(employeeDeviceLogs.getAllEmployeeDeviceLogs());
	}
}
