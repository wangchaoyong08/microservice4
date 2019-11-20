package com.wcy.microservice4.controller;

import com.wcy.microservice4.beans.Dept;
import com.wcy.microservice4.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/depts/{deptNo}")
    public Dept findDeptByDeptNo(@PathVariable("deptNo") Long deptNO){
        return deptService.findDeptByDeptNo(deptNO);
    }
}
