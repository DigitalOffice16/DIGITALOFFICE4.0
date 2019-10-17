package com.edigital.office.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edigital.office.model.dao.EmployeeDetail;
@Repository
public interface EmployeeDetailRepository extends JpaRepository<EmployeeDetail, Long> {
	public EmployeeDetail  findByEmployeeId(Long l);
}