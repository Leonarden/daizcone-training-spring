package com.daizcone.training.springframework.example.business;


import java.util.List;

public interface BusinessService<T> {
	
		public List<T> showData();

}
