package org.fyh.tk.mapper.demo;


import org.fyh.tk.mapper.demo.annotation.FyhService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;


@MapperScan("org.fyh.tk.mapper.demo.mapper")
@SpringBootApplication
public class TkMapperDemoApplication {

    @Resource
    List<Mapper> mapperList;
    public static void main(String[] args) {
        SpringApplication.run(TkMapperDemoApplication.class, args);
    }

    @PostConstruct
    public void start(){
        for (Mapper mapper : mapperList) {
            System.out.println(mapper.hashCode());
        }
    }

}
