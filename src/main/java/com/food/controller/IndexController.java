package com.food.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/index")
	public String ToIndex(){
	
		return "html/index";
	}
	
	@RequestMapping("/index2")
	public String ToIndex2(){
		
		return "html/index2";
	}
	
	@RequestMapping("/index3")
	public String ToIndex3(){
		
		return "html/index3";
	}
	
	@RequestMapping("/index4")
	public String ToIndex4(){
		
		return "html/index4";
	}
	
	@RequestMapping("/index5")
	public String ToIndex5(){
		
		return "html/index5";
	}
	
	@RequestMapping("/index6")
	public String ToIndex6(){
		
		return "html/index6";
	}
	
	@RequestMapping("/index7")
	public String ToIndex7(){
		
		return "html/index7";
	}
	
	@RequestMapping("/index8")
	public String ToIndex8(){
		
		return "html/index8";
	}
	
}
