package com.hussainabdelilah.employees_information;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeesInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private int age;
    private String email;
    private String address;
    private double salary;

    public EmployeesInfo()
    {}

    public EmployeesInfo(String name, int age, String email, String address, double salary) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }
}
