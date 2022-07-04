package com.example.rqchallenge.employeeserver.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class EmployeeList {

  private String status;

  private List<Employee> employeeList;

  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }


  public List<Employee> getEmployeeList() {
    return employeeList;
  }

  @JsonProperty("data")
  public void setEmployeeList(List<Employee> employeeList) {
    this.employeeList = employeeList;
  }

  @Override
  public String toString() {
    return "EmployeeList{" + "status='" + status + '\'' + ", employeeList=" + employeeList + '}';
  }
}
