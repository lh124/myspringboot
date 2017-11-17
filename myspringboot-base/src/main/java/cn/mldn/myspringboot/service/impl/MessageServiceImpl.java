package cn.mldn.myspringboot.service.impl;

import cn.mldn.myspringboot.service.IMessageService;

public class MessageServiceImpl implements IMessageService{

	@Override
	public String echo() {
		return "hello liaohuan";
	}

}
