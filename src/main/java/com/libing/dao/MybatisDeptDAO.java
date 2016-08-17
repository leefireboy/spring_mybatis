/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.libing.bean.Dept;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月28日下午10:04:16
 */
@Repository
public class MybatisDeptDAO implements DeptDAO {

    @Resource
    private SqlSessionTemplate template;

    public void setTemplate(SqlSessionTemplate template) {
        this.template = template;
    }

    @Override
    public List<Dept> findAll() {
        List<Dept> list = template.selectList("findAll");
        return list;
    }

}

