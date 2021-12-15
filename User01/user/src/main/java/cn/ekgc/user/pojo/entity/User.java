package cn.ekgc.user.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import sun.util.calendar.BaseCalendar;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-14 19:56
 * @program: User01
 **/
public class User implements Serializable {
	private static final long serialVersionUID = 7009672352746243501L;
	private Long id;                //主键
	private String name;            //姓名
	private String cellphone;       //电话
	private String password;        //密码
	private Integer gender;         //1：男，0：女
	private Date birthday;          //出生年月
	private Integer isDelete;       //是否删除
	private String img;             //头像
	private Date createTime;        //创建时间
	private Integer createUserId;   //创建人
	private Date updateTime;        //修改时间
	private Integer updateUserId;   //修改人
	@TableField(exist = false)
	private String key;             //外键，数据库字段中不存在


	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", cellphone='" + cellphone + '\'' +
				", password='" + password + '\'' +
				", gender=" + gender +
				", birthday=" + birthday +
				", isDelete=" + isDelete +
				", img='" + img + '\'' +
				", createTime=" + createTime +
				", createUserId=" + createUserId +
				", updateTime=" + updateTime +
				", updateUserId=" + updateUserId +
				'}';
	}
}
