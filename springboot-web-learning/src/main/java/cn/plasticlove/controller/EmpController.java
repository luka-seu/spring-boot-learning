package cn.plasticlove.controller;

import cn.plasticlove.dao.EmployeeDao;
import cn.plasticlove.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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


    @GetMapping ("/emps")
    public String empList(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "list";
    }
}
