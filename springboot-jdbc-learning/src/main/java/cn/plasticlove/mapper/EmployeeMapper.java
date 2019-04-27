package cn.plasticlove.mapper;


import cn.plasticlove.bean.Employee;

public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insetEmp(Employee employee);
}
