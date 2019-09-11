package com.digital.office.model.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/*@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginDTO", propOrder = {

})*/
public class LoginDTO {
	/*@NotNull
	@Size(min = 1, max = 50)
	@XmlElement(required = true)*/
	private String password;
	/*@XmlElement(required = true)
	@Size(min = 1, max = 50)*/
	private String emailId;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDTO [password=" + password + ", emailId=" + emailId + "]";
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
