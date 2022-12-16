package com.baranbatur.insankaynaklarispringboot.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "educations")
public class EducationEntity extends BaseEntity implements Serializable {

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;
    @Column(name = "school_name")
    private String schoolName;
    @Column(name = "end_date")
    private String endDate;
    @Column(name = "degree")
    private String degree;

}
