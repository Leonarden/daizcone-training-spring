package com.daizcone.training.springframework.example.data;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Primary;

import org.springframework.stereotype.Component;

import com.daizcone.training.springframework.example.util.DataUtilRepo;
import com.daizcone.training.springframework.example.util.DataUtilTypes;


@Component
public class DataServiceSec implements DataService<Double> {
	
	private List<Double> data=null; 
	
	public List<Double> getData() {
		this.data = (List<Double>)DataUtilRepo.getData(DataUtilTypes.NUMBER, true);	 
	    return this.data;
	}

	@Override
	public void setData(List<Double> data) {
		
		this.data = data;

	}

	@Override
	public void printData() {
		System.out.println("From Data :(values*2) ");
		/*prints value*2 */
		data.stream().map(s-> 2*s).forEach(s->System.out.println(s));
		
	}
	
	
	
	
	
	
}