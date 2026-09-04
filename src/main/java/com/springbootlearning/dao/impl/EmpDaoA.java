package com.springbootlearning.dao.impl;

import com.springbootlearning.dao.EmpDao;
import com.springbootlearning.pojo.Emp;
import com.springbootlearning.utils.XmlParserUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        // 加载并解析emp.xml文件
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);

        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        return empList;
    }
}
