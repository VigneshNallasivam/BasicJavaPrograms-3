package com.Java.basics;

public class SmallestElement 
{
	 public static void main(String[] args) 
	 {  
		  int [] array = {25, 50, 75, 125, 100};  
	      int min = array[0];  
	      for (int i = 0; i < array.length; i++)
	      {  
	       if(array[i] < min)  
	       min = array[i];  
	       }  
	        System.out.println("Smallest element present in given array: " + min);  
	  }  
}
