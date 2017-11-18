package cn.mldn.myspringboot.thymeleaf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.tools.doclets.internal.toolkit.resources.doclets;

import cn.mldn.myspringboot.thymeleaf.dao.IDeptDAO;
import cn.mldn.myspringboot.thymeleaf.service.IDeptService;
import cn.mldn.myspringboot.thymeleaf.vo.Dept;
@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO;
	@Override
	public List<Dept> list() {
		return this.deptDAO.findAll();
	}

}
