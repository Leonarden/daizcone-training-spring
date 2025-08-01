package com.daizcone.training.springframework.example.web;

import java.util.List;

public interface MyWebController<T> {

	public List<T> callBusinessLayer();
	
}
