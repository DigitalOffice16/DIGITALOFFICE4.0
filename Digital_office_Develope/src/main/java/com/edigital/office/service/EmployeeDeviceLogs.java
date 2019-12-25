package com.edigital.office.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edigital.office.model.dto.EmployeeDeviceLogDto;
@Service
public interface EmployeeDeviceLogs {
 public void getEmployeeDeviceLogs(String employeeId);
 public List<EmployeeDeviceLogDto> getAllEmployeeDeviceLogs();
 public void getAllDepartmentDeviceLogs();
}
