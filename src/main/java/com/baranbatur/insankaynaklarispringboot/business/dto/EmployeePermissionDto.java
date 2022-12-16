package com.baranbatur.insankaynaklarispringboot.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePermissionDto {

    private Long id;
    private String permissionReason;
    private String permissionStartDate;
    private EmployeeDto employee;

}
