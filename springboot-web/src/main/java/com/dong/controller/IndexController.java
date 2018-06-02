package com.dong.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@Value("${application.message}")
	private String message;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", "当前时间为：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		model.put("message", this.message);
		return "welcome";
	}

}
