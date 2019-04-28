package cn.plasticlove.controller;


import cn.plasticlove.bean.Employee;

import cn.plasticlove.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/getEmp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeService.getEmpById(id);
    }


    @GetMapping("/updateEmp")
    public Employee updateEmp(Employee employee){
        return employeeService.uodateEmp(employee);
    }


}
