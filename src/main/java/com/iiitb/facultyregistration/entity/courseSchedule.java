package com.iiitb.facultyregistration.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Course_Schedule")
public class courseSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "course_id")
    private String courseId;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    @Column(name = "Class_day")
    private String classDay;

    @Column(name = "room")
    private int room;

    @Column(name = "building")
    private String building;

    public courseSchedule() {
    }

    public courseSchedule(int id, String courseId, String startTime, String endTime, String classDay, int room, String building) {
        this.id = id;
        this.courseId = courseId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.classDay = classDay;
        this.room = room;
        this.building = building;
    }
}
