package com.springbootlearning.dao;

import com.springbootlearning.pojo.Emp;

import java.util.List;

public interface EmpDao {
    // 读取员工列表数据
    public List<Emp> listEmp();
}
