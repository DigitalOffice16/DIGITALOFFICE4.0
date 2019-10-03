package com.digital.office.model.dao;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "employee_detail")
public class EmployeeDetail {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	
	@Column(name = "Employee_name")
	private String employeeName;
	
	@Column(name = "Employee_code")
	private String employeeCode;

	@Column(name = "Employee_department")
	private String employeeDepartment;

	@Column(name = "Employee_type")
	private String employeeType;

	@Column(name = "dateOfJoin")
	private Date dateOfJoin;

	@Column(name = "LeaveCreditFormDate")
	private Date LeaveCreditForm;

	@Column(name = "shift_type")
	private String shiftType;

	@Column(name = "multiShiftGroup")
	private String multiShiftType;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "device_code")
	private String deviceCode;

	@Column(name = "category")
	private String category;

	@Column(name = "grade")
	private String grade;
	
	@Column(name = "Employee_detail_of_resign")
	private Date dateOfResign;

	@Column(name = "shift_roster")
	private String shiftRoster;

	@Column(name = "Employee_location")
	private String employeeLocation;

	@Column(name = "holiday_group")
	private String holidayGroup;

	@Column(name = "branch")
	private String branch;

	@Column(name = "designation")
	private String designation;

	@Column(name = "status")
	private String status;

	@Column(name = "dateOfConfirmation")
	private String dateOfConfirmation;

	@Column(name = "shift_group")
	private String shiftGroup;

	@Column(name = "contactor")
	private String contactor;

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

	public String getContactor() {
		return contactor;
	}

	public void setContactor(String contactor) {
		this.contactor = contactor;
	}

}
