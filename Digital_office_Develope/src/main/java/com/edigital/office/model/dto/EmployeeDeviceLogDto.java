package com.edigital.office.model.dto;

import java.util.Date;



import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeDeviceLogDto {
	
	private Integer deviceLogId;
	private String deviceName;
	private String deviceSerialNumber;
	private String deviceLocation;
	private String employeeCode;
	private String employeeName;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private String downloadLogDate;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private String logDate;
	public Integer getDeviceLogId() {
		return deviceLogId;
	}
	public void setDeviceLogId(Integer deviceLogId) {
		this.deviceLogId = deviceLogId;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceSerialNumber() {
		return deviceSerialNumber;
	}
	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}
	public String getDeviceLocation() {
		return deviceLocation;
	}
	public void setDeviceLocation(String deviceLocation) {
		this.deviceLocation = deviceLocation;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDownloadLogDate() {
		return downloadLogDate;
	}
	public void setDownloadLogDate(String downloadLogDate) {
		this.downloadLogDate = downloadLogDate;
	}
	public String getLogDate() {
		return logDate;
	}
	public void setLogDate(String logDate) {
		this.logDate = logDate;
	}
	
	

}
