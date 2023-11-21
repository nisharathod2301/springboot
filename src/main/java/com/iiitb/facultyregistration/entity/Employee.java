package com.iiitb.facultyregistration.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "title")
    private String title;

    @Column(name = "photograph_path")
    private String photographPath;

    @Column(name = "department")
    private int department;

    @Column(name = "email")
    private String email;

    public Employee() {
    }

    public Employee(int employeeId, String firstName, String lastName, String title, String photographPath, int department, String email) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.photographPath = photographPath;
        this.department = department;
        this.email = email;
    }
}
