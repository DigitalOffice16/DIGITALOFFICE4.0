package com.digital.office.model.dto;

import java.sql.Date;

public class AddressDto {

	private Long addressId;

	private String employeeId;

	private String fatherName;

	private String mobileNo;

	private String bloodGroup;

	private String emailId;

	private String personalEmailId;

	private String nominee1;

	private String nominee2;

	private Date dob;

	private String birthPlace;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPersonalEmailId() {
		return personalEmailId;
	}

	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}

	public String getNominee1() {
		return nominee1;
	}

	public void setNominee1(String nominee1) {
		this.nominee1 = nominee1;
	}

	public String getNominee2() {
		return nominee2;
	}

	public void setNominee2(String nominee2) {
		this.nominee2 = nominee2;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	@Override
	public String toString() {
		return "AddressDto [addressId=" + addressId + ", employeeId=" + employeeId + ", fatherName=" + fatherName
				+ ", mobileNo=" + mobileNo + ", bloodGroup=" + bloodGroup + ", emailId=" + emailId
				+ ", personalEmailId=" + personalEmailId + ", nominee1=" + nominee1 + ", nominee2=" + nominee2
				+ ", dob=" + dob + ", birthPlace=" + birthPlace + "]";
	}
	
	
}
