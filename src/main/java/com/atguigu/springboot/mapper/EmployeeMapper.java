package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Mr.Z
 * @create 2019/8/5 15:09
 * 配置版MyBatis接口
 */
//@Mapper
public interface EmployeeMapper {
    Employee getEmpById(Integer id);

    Integer insertEmp(Employee employee);
}
