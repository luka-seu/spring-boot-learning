package cn.plasticlove.controller;

import cn.plasticlove.bean.Department;
import cn.plasticlove.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luka-seu
 * @description
 * @create 2019-04 27-19:35
 **/
@RestController
public class DeptController {
    @Autowired
    DepartmentMapper departmentMapper;


    // @GetMapping("/dept/{id}")
    // public Department getDept(@PathVariable("id") Integer id){
    //    return departmentMapper.getDeptById(id);
    // }

    // @PostMapping("/insert")
    // public int insertDept(Department department){
    //     return departmentMapper.insertDept(department);
    // }
}
