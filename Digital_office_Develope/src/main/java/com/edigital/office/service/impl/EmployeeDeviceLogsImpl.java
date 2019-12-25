package com.edigital.office.service.impl;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.edigital.office.dao.repository.EmployeeDeviceLogRepository;
import com.edigital.office.model.dto.EmployeeDeviceLogDto;
import com.edigital.office.service.EmployeeDeviceLogs;

@Service
public class EmployeeDeviceLogsImpl implements EmployeeDeviceLogs {
	@Autowired
	EmployeeDeviceLogRepository employeeDeviceLogRepository;
	@Autowired
	Mapper mapper;

	@Override
	public void getEmployeeDeviceLogs(String employeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EmployeeDeviceLogDto> getAllEmployeeDeviceLogs() {
		List<EmployeeDeviceLogDto> dtoLogList = new ArrayList<>();
		PageRequest.of(0, 150);
		List<Object[]> logList = employeeDeviceLogRepository.getAllEmployeeDeviceLog(PageRequest.of(0, 150));
		for (Object[] log : logList) {
			EmployeeDeviceLogDto employeeDeviceLogDto = new EmployeeDeviceLogDto();
			employeeDeviceLogDto.setDeviceLogId((Integer) log[0]);
			employeeDeviceLogDto.setDeviceName((String) log[1]);
			employeeDeviceLogDto.setDeviceLocation((String) log[2]);
			employeeDeviceLogDto.setDeviceSerialNumber((String) log[3]);
			employeeDeviceLogDto.setEmployeeName((String) log[4]);
			employeeDeviceLogDto.setEmployeeCode((String) log[5]);
			employeeDeviceLogDto.setDownloadLogDate(convertTimeStampToString((Timestamp) log[6]));
			employeeDeviceLogDto.setLogDate(convertTimeStampToString((Timestamp) log[7]));
			dtoLogList.add(employeeDeviceLogDto);
		}
		return dtoLogList;

	}

	public String convertTimeStampToString(Timestamp date) {
		DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return df2.format(date);
		
	}

	@Override
	public void getAllDepartmentDeviceLogs() {
		// TODO Auto-generated method stub

	}

}
