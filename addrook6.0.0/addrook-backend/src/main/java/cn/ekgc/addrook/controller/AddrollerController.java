package cn.ekgc.addrook.controller;

import cn.ekgc.base.controller.BaseController;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>个人通讯录系统-控制层类</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 20:07
 * @program: addrook6.0.0
 **/
//Swagger扫描接口
@ApiOperation(value = "个人通讯录系统-控制层类",tags = "个人通讯录系统-控制层类")
//跨域的
@CrossOrigin
//异步
@RestController("addrollerController")
public class AddrollerController extends BaseController {

}
