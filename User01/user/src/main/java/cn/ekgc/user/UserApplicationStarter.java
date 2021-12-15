package cn.ekgc.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-14 19:58
 * @program: User01
 **/
@MapperScan("cn.ekgc.user.dao")
@SpringBootApplication
public class UserApplicationStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserApplicationStarter.class,args);
	}
}
