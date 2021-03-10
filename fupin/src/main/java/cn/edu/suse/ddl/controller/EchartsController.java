package cn.edu.suse.ddl.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchartsController {
	@RequestMapping(value = "/getJsonData")
	public List<Integer> getJsonData() {
//		List list = new ArrayList();
//		list.add("116.397128");
//		list.add("39.916527");
		List result = new ArrayList();
		Random random = new Random();
		for(int i=0;i<35;i++) {
			result.add(random.nextInt(300));
		}
		
//		System.out.print(result);
		return result; 
	}
}
