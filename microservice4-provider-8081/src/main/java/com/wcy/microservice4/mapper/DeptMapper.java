package com.wcy.microservice4.mapper;

import com.wcy.microservice4.beans.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DeptMapper {

    @Select("select * from dept where deptno = #{deptno}")
    Dept findByPK(Long deptNo);
}
