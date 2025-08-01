package com.daizcone.training.springframework.example.util;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;


public class DataUtilRepo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static List<?>[] dataLists = new List<?>[2]; /*Working with 2 types : STRING , NUMBER*/
	
	
	{
		dataLists[0] = List.of("This is a STATIC message", "SECRETWORD");
		dataLists[1] = List.of(Math.floor(Math.PI),Math.floor(Math.E));
	
	}
	
	public static  List<?> getData(DataUtilTypes t,boolean isNew) {
		int i = 0;
		    if(t!=DataUtilTypes.STRING)
		    	i=1;
			return (isNew)? genNewData(t): dataLists[i];
			
	}
	
    static List<?> genNewData(DataUtilTypes t){
		Integer LEN = 5;
		Integer idx=0, i=0 , j =0;
		String[] words = {"Go", "Sometimes", "Great","Happiness", "Rock and Roll", "Because", "As if", "When","Meaning" };
		List nDList = null;
		if(t == DataUtilTypes.STRING) {
			nDList = new ArrayList<String>();
			 for(i=LEN-1;i>=0;i--) {
				 idx = (int)(Math.floor(100*(Math.random())%words.length));
				 if(!nDList.contains(words[idx]))
					 nDList.add((String) words[idx]);
			 }
			
		}else {
			/*Numeric*/
			nDList = new ArrayList<Double>();
			 for(i=LEN-1;i>=0;i--) {
				 idx = (int)(Math.floor(100*(Math.random())%words.length));
				 nDList.add( Math.floor(Math.random()%100) + words[idx].length());
			 }
			
			
		
		}
		
		return nDList;	
	}

}