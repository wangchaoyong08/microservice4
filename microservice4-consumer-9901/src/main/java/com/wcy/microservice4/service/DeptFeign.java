package com.wcy.microservice4.service;

import com.wcy.microservice4.beans.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("MICROSERVICE4-PROVIDER")
public interface DeptFeign {

    @RequestMapping("/depts/{deptNo}")
    Dept findDeptByDeptNo(@PathVariable("deptNo") Long deptNo);
}
