package com.baranbatur.insankaynaklarispringboot.data.repository;

import com.baranbatur.insankaynaklarispringboot.data.entity.EmployeePermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePermissionRepository extends JpaRepository<EmployeePermissionEntity, Long> {
}
