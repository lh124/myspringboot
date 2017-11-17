package cn.mldn.myspringboot.thymeleaf.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Member  implements Serializable{

	private String mid;
	private Integer age;
	private String name;
	private Double sal;
	private Date hiredate;
	private Long deptno;
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Member [mid=" + mid + ", age=" + age + ", name=" + name + ", sal=" + sal + ", hiredate=" + hiredate
				+ ", deptno=" + deptno + "]";
	}
}
