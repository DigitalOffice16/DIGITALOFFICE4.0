package com.digital.office.model.dao;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User extends AbstractAuditingEntity
{
	private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="user_id",nullable=false)
    private Long userId;
   
    @Column(name="first_name",nullable=false)
    private String firstName;
  
    @Column(name="last_name",nullable=false)
    private String lastName;
    
    @Column(name="email_id",nullable=false)
    private String emailId;
  
    @Size(min=4)
    @Column(nullable=false)
    private String password;
    
    @Column(name="status",nullable=false)
    private String status;
 
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
       name="user_role",
       joinColumns={@JoinColumn(name="user_id")},
       inverseJoinColumns={@JoinColumn(name="role_id")})
    private List<Role> roles;
 
   
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
    public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public List<Role> getRoles()
    {
        return roles;
    }
    public void setRoles(List<Role> roles)
    {
        this.roles = roles;
    }
}
