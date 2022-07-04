package com.example.rqchallenge.employeeserver.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

  private int id;
  private String name;
  private long salary;
  private int age;
  String profile_image;

  public Employee() {

  }

  public Employee(int id, String name, long salary, int age, String profile_image) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.age = age;
    this.profile_image = profile_image;
  }

  public int getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  @JsonProperty("employee_name")
  public void setName(String name) {
    this.name = name;
  }

  public long getSalary() {
    return salary;
  }

  @JsonProperty("employee_salary")
  public void setSalary(long salary) {
    this.salary = salary;
  }

  public int getAge() {
    return age;
  }

  @JsonProperty("employee_age")
  public void setAge(int age) {
    this.age = age;
  }

  public String getProfile_image() {
    return profile_image;
  }

  @JsonProperty("profile_image")
  public void setProfile_image(String profile_image) {
    this.profile_image = profile_image;
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + ", age=" + age
        + ", profile_image='" + profile_image + '\'' + '}';
  }
}
