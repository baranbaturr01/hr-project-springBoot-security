package com.baranbatur.insankaynaklarispringboot.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "employee_permissions")
@Builder
@Data
@NoArgsConstructor
public class EmployeePermissionEntity extends BaseEntity implements Serializable {

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;
    private String permissionReason;
    private String permissionStartDate;

    public EmployeePermissionEntity(EmployeeEntity employee, String permissionReason, String permissionStartDate) {
        this.employee = employee;
        this.permissionReason = permissionReason;
        this.permissionStartDate = permissionStartDate;
    }
}
