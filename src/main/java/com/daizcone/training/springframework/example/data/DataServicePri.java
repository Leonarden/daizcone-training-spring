package com.daizcone.training.springframework.example.data;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Primary;

import org.springframework.stereotype.Component;

import com.daizcone.training.springframework.example.util.DataUtilRepo;
import com.daizcone.training.springframework.example.util.DataUtilTypes;


@Component
public class DataServicePri implements DataService<String> {
	private List<String> data=null; 
	
	public List<String> getData() {
		this.data = (List<String>)DataUtilRepo.getData(DataUtilTypes.STRING, true);	 
	    return this.data;
	}

	@Override
	public void setData(List<String> data) {
		
		this.data = data;

	}

	@Override
	public void printData() {
		System.out.println("From Data : ");
		data.stream().map(s-> " " +s).forEach(s->System.out.print(s));
		
	}
	
	
	
	
	
	
}