//package com.example.employee.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

//@Entity
//public class Employee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String email;
//    private String phone;
//    private String department;
//    private double salary;
//
//    public Employee() {
//    }
//
//    public Employee(Long id, String name, String email, String phone,
//                    String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//        this.department = department;
//        this.salary = salary;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//}
package com.example.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String department;
    private double salary;

    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(Long id, String name, String email, String phone,
                    String department, double salary) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.salary = salary;
    }

    // ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}