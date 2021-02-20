package org.fyh.tk.mapper.demo.register;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 定义一个bean注册器
 * @author fangyunhe
 * @version 1.0
 * @Description
 * @time 2020/7/27 11:27
 */
public class FyhAutoConfiguredRegistrar implements ImportBeanDefinitionRegistrar, ResourceLoaderAware, BeanFactoryAware {

    private ResourceLoader resourceLoader;

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        MyClassPathBeanDefinitionScanner scanner = new MyClassPathBeanDefinitionScanner(registry, false);
        scanner.setResourceLoader(resourceLoader);
        scanner.registerFilters();
        scanner.doScan("org.fyh.tk.mapper.demo");
    }
}