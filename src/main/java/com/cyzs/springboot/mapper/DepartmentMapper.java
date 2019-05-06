package com.cyzs.springboot.mapper;

import com.cyzs.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author xiaoH
 * @create 2019-05-05-16:41
 */
//@Mapper
public interface DepartmentMapper {

    @Select("select * from `department` where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public void insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
