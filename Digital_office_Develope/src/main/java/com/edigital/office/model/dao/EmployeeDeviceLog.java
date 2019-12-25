package com.edigital.office.model.dao;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "devicelogs_processed")
public class EmployeeDeviceLog {
	@Id
	@Column(name = "DeviceLogId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deviceLogId;
	
	@Column(name = "DeviceId")
	private Integer deviceId;
	
	@Column(name = "UserId",insertable=false ,updatable=false)
	private String employeeId;
	
	@Column(name = "DownloadDate")
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	private Date downloadLogDate;
	
	
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LogDate", insertable=false ,updatable=false)
	private Date logDate;



	

	public Integer getDeviceLogId() {
		return deviceLogId;
	}

	public void setDeviceLogId(Integer deviceLogId) {
		this.deviceLogId = deviceLogId;
	}

	public Integer getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Date getDownloadLogDate() {
		return downloadLogDate;
	}

	public void setDownloadLogDate(Date downloadLogDate) {
		this.downloadLogDate = downloadLogDate;
	}

	public Date getLogDate() {
		return logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	
	
}
