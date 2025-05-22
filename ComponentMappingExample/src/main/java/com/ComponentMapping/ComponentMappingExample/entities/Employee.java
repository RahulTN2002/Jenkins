package com.ComponentMapping.ComponentMappingExample.entities;

import jakarta.persistence.*;

@Entity
@Table(name="employee_1")
public class Employee {

    @Id
    @Column(name="id")
    private int employeeId;
    @Column(name="name")
    private String employeeName;

    @Embedded
    private Address adress;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }
}
