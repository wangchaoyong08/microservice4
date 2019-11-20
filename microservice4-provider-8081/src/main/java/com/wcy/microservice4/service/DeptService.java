package com.wcy.microservice4.service;

import com.wcy.microservice4.beans.Dept;

public interface DeptService {
    Dept findDeptByDeptNo(Long deptNO);
}
