package com.springbootlearning.controller;

import com.springbootlearning.pojo.Emp;
import com.springbootlearning.service.EmpService;
import com.springbootlearning.service.impl.EmpServiceA;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    //@Qualifier("empServiceA") // 指定使用EmpServiceA
    //@Autowired
    //private EmpService empService;

    @Resource(name = "empServiceB") // 指定使用EmpServiceA
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
        List<Emp> empList = empService.listEmp();

        return Result.success(empList);
    }
}


/*
// 加载并解析emp.xml文件
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);

        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        empList.forEach(emp -> {
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            } else {
                emp.setGender("未知");
            }

            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            } else {
                emp.setJob("未知");
            }
        });

 */