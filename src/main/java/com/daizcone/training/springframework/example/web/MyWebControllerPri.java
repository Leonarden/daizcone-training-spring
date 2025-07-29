package com.daizcone.training.springframework.example.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.daizcone.training.springframework.example.business.BusinessService;
import java.util.List;


@Component
public class MyWebControllerPri implements MyWebController<String> {
	
	@Autowired
	private BusinessService<String> businessService;
	
	@Override
	public List<String> callBusinessLayer() {
		
		List<String> d = businessService.showData();
	
		return d;
	}

}