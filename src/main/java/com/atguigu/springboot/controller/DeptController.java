package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.Department;
import com.atguigu.springboot.bean.Employee;
import com.atguigu.springboot.mapper.DepartmentMapper;
import com.atguigu.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mr.Z
 * @create 2019/8/5 14:26
 * 用来简单的测试
 */
@Controller
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    @ResponseBody
    public Department getDepartment(@PathVariable("id") Integer id){
        Department department = departmentMapper.getDeptById(id);
        return department;
    }

//    @PutMapping("/dept")
//    public Department updateDept(Department department){
//        departmentMapper.insertDep(department);
//        return department;
//    }
//
//    @DeleteMapping("/dept/{id}")
//    public void deleteDept(@PathVariable("id") Integer id){
//        departmentMapper.deleteById(id);
//    }

    @GetMapping("/emp/{id}")
    @ResponseBody
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }

    @GetMapping("/dept")
    @ResponseBody
    public Department insertDept(Department department){
        departmentMapper.insertDep(department);
        return department;
    }
}
