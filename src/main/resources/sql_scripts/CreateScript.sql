CREATE TABLE IF NOT EXISTS Departments (
    department_id int AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    capacity int NOT NULL,
    PRIMARY KEY (department_id)
);

CREATE TABLE IF NOT EXISTS Employees (
    employee_id int AUTO_INCREMENT,
    first_name varchar(255) NOT NULL,
    last_name varchar(255),
    title varchar(255),
    photograph_path varchar(255),
    department int,
    PRIMARY KEY (employee_id),
    email varchar(255) NOT NULL UNIQUE,
    FOREIGN KEY (department) REFERENCES Departments(department_id)
);

CREATE TABLE IF NOT EXISTS Courses(
    course_id int AUTO_INCREMENT,
    course_code varchar(255) UNIQUE NOT NULL,
    name varchar(255) NOT NULL,
    description varchar(255),
    Academic_year int NOT NULL,
    term int NOT NULL,
    credits int NOT NULL,
    capacity int NOT NULL,
    faculty_id int,
    PRIMARY KEY (course_id),
    FOREIGN KEY (faculty_id) REFERENCES Employees(employee_id)
);

CREATE TABLE IF NOT EXISTS Course_Schedule(
    id int AUTO_INCREMENT,
    course_id int,
    start_time varchar(5),
    end_time varchar(5),
    Class_day varchar(10),
    room int NOT NULL,
    building varchar(255),
    PRIMARY KEY (id),
    FOREIGN KEY (course_id) REFERENCES Courses(course_id)
);