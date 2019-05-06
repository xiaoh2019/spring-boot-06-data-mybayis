package com.cyzs.springboot.bean;

/**
 * @author xiaoH
 * @create 2019-05-05-16:30
 */
public class Department {
    private Integer id;
    private  String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
