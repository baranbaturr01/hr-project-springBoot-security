package com.baranbatur.insankaynaklarispringboot.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDto {

    private Long id;
    private String school_name;
    private String end_date;
    private String degree;
    private EmployeeDto employee;
}
