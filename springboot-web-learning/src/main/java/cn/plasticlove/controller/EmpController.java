package cn.plasticlove.controller;

import cn.plasticlove.dao.DepartmentDao;
import cn.plasticlove.dao.EmployeeDao;
import cn.plasticlove.entity.Department;
import cn.plasticlove.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author luka-seu
 * @description
 * @create 2019-04 26-00:30
 **/
@Controller
public class EmpController {
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;


    @GetMapping ("/emps")
    public String empList(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "list";
    }


    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);

        return "add";
    }


    @PostMapping("/emp")
    public String addEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }


    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.getEmpById(id);
        model.addAttribute("emp",employee);

        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);

        return "add";
    }

    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }


    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
       employeeDao.deleteEmpById(id);
        return "redirect:/emps";
    }
}
