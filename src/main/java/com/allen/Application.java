package com.allen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;

@SpringBootApplication
@EnableMethodCache(basePackages="com.allen")
@EnableCreateCacheAnnotation
@EnableTransactionManagement//开启事务支持
@MapperScan("com.allen.dao")//扫描mybatis的Mapper类所在目录
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
