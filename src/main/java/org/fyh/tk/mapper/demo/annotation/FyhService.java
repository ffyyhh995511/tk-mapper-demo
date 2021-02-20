package org.fyh.tk.mapper.demo.annotation;

import java.lang.annotation.*;
/**
 * 自定义注解，使被注解的类被spring初始化为bean
 * @return
 * @author fangyunhe
 * @time 2020/7/27 11:23
 **/
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface FyhService {
    String name() default "";

}