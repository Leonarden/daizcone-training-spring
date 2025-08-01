package com.daizcone.training.springframework.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.daizcone.training.springframework.example.data.DataService;



@Component
public class BusinessServicePri implements BusinessService<String>   {

	@Autowired
	private DataService<String> dataService;

	Class<String> clazz; 
	
	
	
	@Override
	public List<String> showData() {

			List<String> d = dataService.getData();
			System.out.println("From Business: data = " + d.toArray().toString());
			System.out.println("****");
			
			dataService.printData();
			
			System.out.println("****");
			
			return d;
		
	}
}
