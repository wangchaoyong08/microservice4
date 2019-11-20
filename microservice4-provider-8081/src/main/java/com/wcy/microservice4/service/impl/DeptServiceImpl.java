package com.wcy.microservice4.service.impl;

import com.wcy.microservice4.beans.Dept;
import com.wcy.microservice4.mapper.DeptMapper;
import com.wcy.microservice4.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public Dept findDeptByDeptNo(Long deptNO) {
        return deptMapper.findByPK(deptNO);
    }
}
