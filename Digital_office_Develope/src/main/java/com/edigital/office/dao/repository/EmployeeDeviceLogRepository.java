package com.edigital.office.dao.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edigital.office.model.dao.EmployeeDeviceLog;
@Repository
public interface EmployeeDeviceLogRepository extends JpaRepository<EmployeeDeviceLog, Long>{
@Query(value="Select dl.DeviceLogId,d.DevicesName,d.DeviceLocation ,d.SerialNumber,e.EmployeeName ,e.EmployeeCode,dl.DownloadDate,dl.LogDate from devicelogs_processed dl join devices d on dl.DeviceId=d.DeviceId join employees e on  dl.UserId=e.EmployeeCode order by dl.DeviceLogId desc",nativeQuery=true)
 public List<Object[]> getAllEmployeeDeviceLog(Pageable pageable);
}
