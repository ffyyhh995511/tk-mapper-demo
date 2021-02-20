package org.fyh.tk.mapper.demo.config;

import org.fyh.tk.mapper.demo.register.FyhAutoConfiguredRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 启动动态bean注册器
 */
@Configuration
@Import(value = {FyhAutoConfiguredRegistrar.class})
public class AnnotationAutoConfig {
}