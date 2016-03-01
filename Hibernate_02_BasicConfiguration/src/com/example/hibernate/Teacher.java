package com.example.hibernate;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * 推荐写在get方法上面
 * 放在属性上面会破坏封装性
 * 
 * @Id
 *  主键
 * @Transient 忽略字段
 * 	配置文件里面不写就可以了
 * @Temporal(TemporalType.DATE)
 * 	只记录日期
 * 
 * 
 * @author 北飞的候鸟
 */

@Entity
@Table(name = "_teacher")
public class Teacher {
	
	private int id;
	private String name;
	private String title;
	private String yourWifeName;
	
	private Date birthDate;
	private boolean good;
	private Gender gender;

	/**
	 * 枚举类型
	 * 安字符串存储
	 * @return
	 */
	@Enumerated(EnumType.STRING)
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	@Transient
	public String getYourWifeName() {
		return yourWifeName;
	}

	public void setYourWifeName(String yourWifeName) {
		this.yourWifeName = yourWifeName;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Temporal(TemporalType.TIME)
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
