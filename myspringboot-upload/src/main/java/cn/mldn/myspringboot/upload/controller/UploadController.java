package cn.mldn.myspringboot.upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	@RequestMapping("uploads")
	public String per(Model model) {
		return "message/pages/back/admin/upload";
	}
	
	@RequestMapping(value="/upload",method= RequestMethod.POST)
	public void fileupload(MultipartFile  filter) {
		if(filter!=null) {
			System.err.println("原始文件名称：" + filter.getOriginalFilename());
			System.err.println("文件的类型：" + filter.getContentType());
			System.err.println("文件大小：" + filter.getSize());
		}
	}
}
