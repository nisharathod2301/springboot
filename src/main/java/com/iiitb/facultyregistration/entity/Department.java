package com.iiitb.facultyregistration.entity;

import jakarta.persistence.*;

@Entity
@Table(name="departments")

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private int departmentId;
    @Column(name = "name")
    private String name;
    @Column(name = "capacity")
    private int capacity;

    public Department() {
    }

    public Department(int departmentId, String name, int capacity) {
        this.departmentId = departmentId;
        this.name = name;
        this.capacity = capacity;
    }

}
