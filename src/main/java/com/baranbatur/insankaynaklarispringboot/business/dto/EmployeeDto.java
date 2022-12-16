package com.baranbatur.insankaynaklarispringboot.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {

    private Long id;
    private String first_name;
    private String last_name;
    private String position;
    private String salary;
    private String birth_date;
}
