package com.daizcone.training.springframework.example.data;

import java.util.List;


public interface DataService<T> {
	

	public List<T> getData();
	public void setData(List<T> data);
	
	public void printData();
	
}