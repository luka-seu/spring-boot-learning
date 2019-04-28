package cn.plasticlove.service.impl;

import cn.plasticlove.bean.Employee;
import cn.plasticlove.mapper.EmployeeMapper;
import cn.plasticlove.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/28-14:23
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    @Override
    @Cacheable(cacheNames = {"emp"})
    public Employee getEmpById(Integer id){
        System.out.println("查询id= "+id+"的员工");
        return employeeMapper.getEmpById(id);
    }

    @Override

    @CachePut(value = "emp",key = "#employee.id")
    public Employee uodateEmp(Employee employee) {
        employeeMapper.updateEmp(employee);
        return employee;
    }
}
