package cn.ekgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <b>项目启动类</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 18:11
 * @program: addrook6.0.0
 **/
@MapperScan("cn.ekgc.addrook.dao")
@SpringBootApplication
public class SystemApplicationStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemApplicationStarter.class,args);
	}
}
