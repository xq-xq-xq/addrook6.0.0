package com.xq.litego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>基础信息功能- 基础控制类</b>
 *<p>
 *     基础控制层依赖注入了如下属性：
 *     1：HttpServletRequest<br/>
 *     2：HttpServletResponse<br/>
 *     3：HttpSession<br/>
 *</p>
 * @author: Mr.Xi
 * @create: 2021-12-29 21:32
 * @program: HealthcareProject
 * @version 1.0.0
 **/
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}
