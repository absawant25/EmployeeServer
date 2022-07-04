package com.example.rqchallenge.employeeserver.resources;

import com.example.rqchallenge.employeeserver.models.EmployeeList;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

  @Value("classpath:static/employees.json")
  Resource resourceFile;

  Logger log = LoggerFactory.getLogger(EmployeesController.class);

  @GetMapping()
  public EmployeeList getEmployeeList() throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    EmployeeList employeeList = objectMapper.readValue(resourceFile.getFile(), EmployeeList.class);

    log.info("EmployeeList : {}", employeeList.getEmployeeList());

    return employeeList;
  }

}
