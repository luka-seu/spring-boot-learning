package cn.plasticlove.service;

import cn.plasticlove.bean.Employee;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/28-14:22
 */
public interface EmployeeService {
    public Employee getEmpById(Integer id);


    public Employee uodateEmp(Employee employee);

}
