package cn.ekgc.base.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 19:46
 * @program: addrook6.0.0
 **/
@ApiModel(value = "基础视图信息")
public class BaseVO implements Serializable {
	private static final long serialVersionUID = 6031952249930946279L;
	@ApiModelProperty(value = "系统状态：0：禁用，1：启用")
	private String status;                  //系统状态：0：禁用，1：启用
	@ApiModelProperty(value = "创建时间")
	private Date createTime;                //创建时间
	@ApiModelProperty(value = "修改时间")
	private Date modifiedTime;              //修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
