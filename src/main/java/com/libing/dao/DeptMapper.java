/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.dao;

import java.util.List;

import com.libing.annotation.MybatisRepository;
import com.libing.bean.Dept;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月25日下午3:22:23
 */
@MybatisRepository
public interface DeptMapper {

    public List<Dept> findAll();

}

