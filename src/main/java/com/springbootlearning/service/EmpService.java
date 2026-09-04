package com.springbootlearning.service;

import com.springbootlearning.pojo.Emp;

import java.util.List;

public interface EmpService {
    // 获取员工列表
    public List<Emp> listEmp();
}
