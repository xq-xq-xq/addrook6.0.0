package com.xq.litego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>智慧医疗信息平台 - Eureka 注册中心启动类</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-29 21:08
 * @program: HealthcareProject
 * @version 1.0.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class LitegoRegistryStarter {
	public static void main(String[] args) {
		SpringApplication.run(LitegoRegistryStarter.class,args);
	}
}
