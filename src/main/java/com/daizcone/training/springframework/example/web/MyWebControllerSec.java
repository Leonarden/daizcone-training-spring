package com.daizcone.training.springframework.example.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.daizcone.training.springframework.example.business.BusinessService;
import java.util.List;


@Component
public class MyWebControllerSec implements MyWebController<Double> {
	
	@Autowired
	private BusinessService<Double> businessService;
	
	@Override
	public List<Double> callBusinessLayer() {
		
		List<Double> d = businessService.showData();
	
		return d;
	}

}