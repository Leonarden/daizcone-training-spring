package com.daizcone.training.springframework.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.daizcone.training.springframework.example.data.DataService;



@Component

public class BusinessServiceSec implements BusinessService<Double>   {

	@Autowired
	private DataService<Double> dataService;


	
	
	@Override
	public List<Double> showData() {

			List<Double> d = dataService.getData();
			System.out.println("From Business: data = " + d.toArray().toString());
			
			System.out.println("++++");
			
			dataService.printData();
			
			System.out.println("++++");
			
			return d;
		
	}
}
