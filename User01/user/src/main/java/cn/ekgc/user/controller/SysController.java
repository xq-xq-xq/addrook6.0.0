package cn.ekgc.user.controller;

import cn.ekgc.user.pojo.entity.User;
import cn.ekgc.user.utils.MD4;
import cn.ekgc.user.utils.Msg;
import com.alibaba.druid.util.StringUtils;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-14 21:38
 * @program: User01
 **/
@Controller("sysController")
public class SysController {
	public User login(String cellphone, String password, HttpServletRequest request){
		User user = new User();
		user.setKey(MD4.md4add(user.getId()+""));
		// 1.判断用户名去数据库查找对应字段，判断是否存在，存在之后拿出对应的信息拿出来
		if(StringUtils.isEmpty(cellphone) || StringUtils.isEmpty(password)){
			if(user != null){
				if(user.getPassword().equals(password)){
					return Msg.success(user);
				}
				return Msg.error("对象不存在");
			}
			return Msg.error("手机号码或者密码为空");
		}
		// 2.判断该用用户是否存在，不存在，返回提示信息，如果存在，在对象中取出登录密码进行比对（使用equlas方法），
		// 如果对比相等，返回用户信息，返回用户属性里面的key不映射到数据库

		return Msg.error("信息有误");
	}

}
