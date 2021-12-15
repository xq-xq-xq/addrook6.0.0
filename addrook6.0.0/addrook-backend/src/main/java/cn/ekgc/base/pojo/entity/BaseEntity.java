package cn.ekgc.base.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 19:40
 * @program: addrook6.0.0
 **/
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = -40080255359219953L;
	@TableField(exist = false)
	private String status;                  //状态0：禁用，1：启用
	@TableField(exist = false)
	private String creater;                 //创建人
	@TableField(value = "createTime")
	private Date createTime;              //创建时间
	@TableField(exist = false)
	private String modifiedBy;              //修改人
	@TableField(value = "modifiedTime")
	private Date modifiedTime;              //修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
