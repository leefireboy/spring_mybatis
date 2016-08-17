/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.annotation;

import org.springframework.stereotype.Repository;

/**
 * <P>
 * Description:自定义扫描 mapper 注解
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月28日下午6:40:38
 */
@Repository
public @interface MybatisRepository {

    String value() default "";

}

