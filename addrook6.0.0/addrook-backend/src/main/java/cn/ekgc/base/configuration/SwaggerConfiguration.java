package cn.ekgc.base.configuration;

import cn.ekgc.base.util.BaseConstants;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <b>Swagger 文档框架配置类</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 18:55
 * @program: addrook6.0.0
 **/
@Configuration
public class SwaggerConfiguration {
	/**
	 * <b>获得 Swagger 核心对象 Docket</b>
	 * */
	public Docket creteRestAPI(){
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				//设置 Swagger扫描注解位置
				.select()
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
				.paths(PathSelectors.any())
				.build();
		return docket;
	}

	/**
	 * <b>配置 Swagger 文档说明文字信息</b>
	 * */
	private ApiInfo apiInfo(){
		ApiInfo apiInfo = new ApiInfoBuilder()
				//文档标题
				.title(BaseConstants.SWAGGER_TITLE)
				//文档描述
				.description(BaseConstants.SWAGGER_DESCRIPTION)
				//文档版本
				.version(BaseConstants.SWAGGER_VERSION)
				//文档联系人
				.contact(new Contact(BaseConstants.SWAGGER_CONTACT_NAME,BaseConstants.SWAGGER_CONTACT_URL,BaseConstants.SWAGGER_CONTACT_EMAIL))
				.build();
		return apiInfo;
	}
}
