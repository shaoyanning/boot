package cn.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 1: boot微服务采用注解完全取代了xml配置, 2: boot遵循约定优于配置
@SpringBootApplication
// MapperScannerConfigurer
@MapperScan(basePackages="cn.boot.dao")
public class BootRun {
	public static void main(String[] args) {
		// 指定微服务的入口
		SpringApplication.run(BootRun.class, args);
	}
}
