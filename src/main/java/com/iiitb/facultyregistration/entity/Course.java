package com.iiitb.facultyregistration.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int courseId;

    @Column(name = "course_code")
    private String courseCode;

    @Column(name = "name")
    private String name;

    @Column(name = "Academic_year")
    private String acadamicYear;

    @Column(name = "term")
    private String term;

    @Column(name = "credits")
    private int credits;

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "faculty_id")
    private String facultyId;

    public Course() {
    }

    public Course(int courseId, String courseCode, String name, String acadamicYear, String term, int credits, String capacity, String facultyId) {
        this.courseId = courseId;
        this.courseCode = courseCode;
        this.name = name;
        this.acadamicYear = acadamicYear;
        this.term = term;
        this.credits = credits;
        this.capacity = capacity;
        this.facultyId = facultyId;
    }
}
