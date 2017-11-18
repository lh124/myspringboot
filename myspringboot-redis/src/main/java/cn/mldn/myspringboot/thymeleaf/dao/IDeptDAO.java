package cn.mldn.myspringboot.thymeleaf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.mldn.myspringboot.thymeleaf.vo.Dept;
@Mapper
public interface IDeptDAO {
	public List<Dept> findAll();
}
