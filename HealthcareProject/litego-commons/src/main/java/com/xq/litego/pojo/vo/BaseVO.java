package com.xq.litego.pojo.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础信息功能 - 基础视图信息</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-29 21:37
 * @program: HealthcareProject
 **/
public class BaseVO implements Serializable {
	private static final long serialVersionUID = -6385739592080798980L;
	private String status;                  //系统状态：0-禁用，1-启用
	private String createBy;                 //创建人
	private Date createdTime;                //创建时间
	private String modifiedBy;              //修改人
	private Date modifiedTime;              //修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
