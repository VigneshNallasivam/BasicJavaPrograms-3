package com.Java.basics;

public class OddPosition
{
	public static void main(String[] args) 
    {    
        int [] array = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array present on Odd position: ");   
        for (int i = 0; i < array.length; i = i+2) 
        {  
            System.out.println(array[i]);  
        }  
    }  
}
