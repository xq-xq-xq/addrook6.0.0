package cn.ekgc.base.exception;

import cn.ekgc.base.pojo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * <b>系统全局异常信息处理类</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 18:21
 * @program: addrook6.0.0
 **/
@RestControllerAdvice("globalExceptionHandler")
public class GlobalExceptionHandler {
	//当出现异常时，需要记录日志，那么使用 slf4j 日志对象
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 *<b>全局处理异常</b>
	 * */
	public ResponseVO globalException(HttpServletRequest request, HttpServletResponse response, Exception e){
		//将错误信息记录到日志中
		logger.error(e.getMessage() + " : " +new Date(),e);
		//产生异常视图信息返回给前端
		return ResponseVO.exceptionResponseVO(e);
	}
}
