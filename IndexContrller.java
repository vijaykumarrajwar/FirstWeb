package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexContrller {
	@RequestMapping("/")
 public String index(){
		System.out.println("i am java programming");
	  return "index.jsp";
			  }

}
	
