/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.libing.bean.Dept;
import com.libing.dao.DeptDAO;
import com.libing.dao.DeptMapper;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月25日下午3:15:18
 */
public class TestDeptMapper {

    @Ignore
    @Test
    public void testFindAll() {
        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        DeptMapper mapper = ac.getBean("deptMapper", DeptMapper.class);
        List<Dept> list = mapper.findAll();
        for (Dept dept : list) {
            System.out.println(dept.getDeptno() + " " + dept.getDname());
        }
        AbstractApplicationContext aac = (AbstractApplicationContext) ac;
        aac.close();
    }

    @Ignore
    @Test
    public void testScanFindAll() {
        String conf = "spring-scan.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        DeptMapper mapper = ac.getBean("deptMapper", DeptMapper.class);
        List<Dept> list = mapper.findAll();
        for (Dept dept : list) {
            System.out.println(dept.getDeptno() + " " + dept.getDname());
        }
        AbstractApplicationContext aac = (AbstractApplicationContext) ac;
        aac.close();
    }

    @Ignore
    @Test
    public void testScanAnnotationFindAll() {
        String conf = "spring-scan-annotation.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        DeptMapper mapper = ac.getBean("deptMapper", DeptMapper.class);
        List<Dept> list = mapper.findAll();
        for (Dept dept : list) {
            System.out.println(dept.getDeptno() + " " + dept.getDname());
        }
        AbstractApplicationContext aac = (AbstractApplicationContext) ac;
        aac.close();
    }

    @Test
    public void testTemplateFindAll() {
        String conf = "spring-template.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        DeptDAO dao = ac.getBean("mybatisDeptDAO", DeptDAO.class);
        List<Dept> list = dao.findAll();
        for (Dept dept : list) {
            System.out.println(dept.getDeptno() + " " + dept.getDname());
        }
        AbstractApplicationContext aac = (AbstractApplicationContext) ac;
        aac.close();
    }

}

