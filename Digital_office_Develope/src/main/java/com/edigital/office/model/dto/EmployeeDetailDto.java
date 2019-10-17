package com.edigital.office.model.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class EmployeeDetailDto {
	private Long employeeId;

	private String employeeName;

	private String employeeCode;

	private String employeeDepartment;

	private String employeeType;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateOfJoin;

	private Date LeaveCreditForm;

	private String shiftType;

	private String multiShiftType;

	private String userName;

	private String password;

	private String deviceCode;

	private String category;

	private String grade;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateOfResign;

	private String shiftRoster;

	private String employeeLocation;

	private String holidayGroup;

	private String branch;

	private String designation;

	private String status;

	private String dateOfConfirmation;

	private String shiftGroup;

	private String contractor;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public Date getLeaveCreditForm() {
		return LeaveCreditForm;
	}

	public void setLeaveCreditForm(Date leaveCreditForm) {
		LeaveCreditForm = leaveCreditForm;
	}

	public String getShiftType() {
		return shiftType;
	}

	public void setShiftType(String shiftType) {
		this.shiftType = shiftType;
	}

	public String getMultiShiftType() {
		return multiShiftType;
	}

	public void setMultiShiftType(String multiShiftType) {
		this.multiShiftType = multiShiftType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getDateOfResign() {
		return dateOfResign;
	}

	public void setDateOfResign(Date dateOfResign) {
		this.dateOfResign = dateOfResign;
	}

	public String getShiftRoster() {
		return shiftRoster;
	}

	public void setShiftRoster(String shiftRoster) {
		this.shiftRoster = shiftRoster;
	}

	public String getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	public String getHolidayGroup() {
		return holidayGroup;
	}

	public void setHolidayGroup(String holidayGroup) {
		this.holidayGroup = holidayGroup;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDateOfConfirmation() {
		return dateOfConfirmation;
	}

	public void setDateOfConfirmation(String dateOfConfirmation) {
		this.dateOfConfirmation = dateOfConfirmation;
	}

	public String getShiftGroup() {
		return shiftGroup;
	}

	public void setShiftGroup(String shiftGroup) {
		this.shiftGroup = shiftGroup;
	}

	

	public String getContractor() {
		return contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	@Override
	public String toString() {
		return "EmployeeDetailDto [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeCode="
				+ employeeCode + ", employeeDepartment=" + employeeDepartment + ", employeeType=" + employeeType
				+ ", dateOfJoin=" + dateOfJoin + ", LeaveCreditForm=" + LeaveCreditForm + ", shiftType=" + shiftType
				+ ", multiShiftType=" + multiShiftType + ", userName=" + userName + ", password=" + password
				+ ", deviceCode=" + deviceCode + ", category=" + category + ", grade=" + grade + ", dateOfResign="
				+ dateOfResign + ", shiftRoster=" + shiftRoster + ", employeeLocation=" + employeeLocation
				+ ", holidayGroup=" + holidayGroup + ", branch=" + branch + ", designation=" + designation + ", status="
				+ status + ", dateOfConfirmation=" + dateOfConfirmation + ", shiftGroup=" + shiftGroup + ", contactor="
				+ contractor + "]";
	}

}
