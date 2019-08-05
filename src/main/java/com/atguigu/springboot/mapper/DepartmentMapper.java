package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Z
 * @create 2019/8/5 14:19
 * 此接口为MyBatis的注解版接口
 */
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id =#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteById(Integer id);

    //获取自增主键
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDep(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
