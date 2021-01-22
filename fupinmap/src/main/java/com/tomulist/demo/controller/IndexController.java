package com.tomulist.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags="首页控制类")
@Controller
public class IndexController {
	@RequestMapping("/")
	@ApiOperation(value = "主页映射")
	public String HOMEPAGE() {
		return "index";
	}
	
	@RequestMapping("/switch{layer}")
	@ApiOperation(value = "主页图层切换")
	public String switchLayer(@PathVariable("layer") Integer layer) {
		switch (layer) {
		case 1:
			return "";
		case 2:
			return "";
		case 3:
			return "";
		default:
			return "";
		}
	}
	
	
	
}
