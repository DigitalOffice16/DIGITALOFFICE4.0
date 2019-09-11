package com.digital.office.model.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "roles")
public class Role extends AbstractAuditingEntity{
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="role_id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long roleId;
    @Column(name="role_name",nullable = false, unique = true)
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private List < User > users;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List < User > getUsers() {
        return users;
    }

    public void setUsers(List < User > users) {
        this.users = users;
    }
}
