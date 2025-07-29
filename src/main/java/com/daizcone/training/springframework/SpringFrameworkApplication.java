package com.daizcone.training.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.daizcone.training.springframework.bean.GameRunner;
import com.daizcone.training.springframework.example.web.*;

@SpringBootApplication
//@ComponentScan("com.daizcone.spring.learnspringframework")
//@ComponentScan({"com.package1", "com.package2"})
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		

		ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);

		System.out.println("Calling Controllers:\n\n");
		System.out.println("Controller 1:");
		MyWebController<String> controller1 = context.getBean(MyWebControllerPri.class);
		controller1.callBusinessLayer(); 
		System.out.println("Controller 2:");
		MyWebController<Double> controller2 = context.getBean(MyWebControllerSec.class);
		controller2.callBusinessLayer();
		 
		

	}

}
