package cn.ekgc.base.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Properties;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 19:20
 * @program: addrook6.0.0
 **/
public class BaseConstants {
	private static Properties props = new Properties();
	//创建日志对象，将所产生额异常记录在日志中
	private static Logger logger = LoggerFactory.getLogger(BaseConstants.class);
	static {
		try {
			//加载位于 props/base 下的 base.properties 文件
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		}catch (Exception e){
			e.printStackTrace();
			//将异常信息记录在日志中
			logger.error(e.getMessage()+ " : " +new Date(),e);
		}
	}
	/**
	 * <b>Swagger 文档配置信息: 文档标题</b>
	 * */
	public static final String SWAGGER_TITLE = props.getProperty("swagger.title");

	/**
	 * <b>Swagger 文档配置信息: 文档说明</b>
	 * */
	public static final String SWAGGER_DESCRIPTION = props.getProperty("swagger.description");

	/**
	 * <b>Swagger 文档配置信息: 文档版本</b>
	 * */
	public static final String SWAGGER_VERSION = props.getProperty("swagger.version");

	/**
	 * <b>Swagger 文档配置信息: 文档姓名</b>
	 * */
	public static final String SWAGGER_CONTACT_NAME = props.getProperty("swagger.contact.name");

	/**
	 * <b>Swagger 文档配置信息: 文档rul</b>
	 * */
	public static final String SWAGGER_CONTACT_URL = props.getProperty("swagger.contact.url");

	/**
	 * <b>Swagger 文档配置信息: 文档email</b>
	 * */
	public static final String SWAGGER_CONTACT_EMAIL = props.getProperty("swagger.contact.email");

}
