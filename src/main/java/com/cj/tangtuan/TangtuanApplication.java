package com.cj.tangtuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//开启事务，使用时将@Transactional 注解加到service实现类上
@EnableTransactionManagement
//必须加这个，不加报错，如果不加，也可以在每个mapper上添加@Mapper注释
@MapperScan("com.cj.tangtuan.mapper")
public class TangtuanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TangtuanApplication.class, args);
	}
}
