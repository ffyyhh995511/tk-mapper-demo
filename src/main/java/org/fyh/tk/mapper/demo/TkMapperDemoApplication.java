package org.fyh.tk.mapper.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan("org.fyh.tk.mapper.demo.mapper")
@SpringBootApplication
public class TkMapperDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TkMapperDemoApplication.class, args);
    }

}
