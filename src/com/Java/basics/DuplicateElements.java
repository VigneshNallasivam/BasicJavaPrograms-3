package com.Java.basics;

public class DuplicateElements 
{
	  public static void main(String argu[]) 
	  {
	  int array[] = {1,2,3,4,5,2,3,4,6};
	  System.out.println("Duplicate Elements In An Array Are : ");
	  for(int i=0;i<array.length;i++)        //Index Position '0'
	  {
		for(int j=i+1;j<array.length;j++)    //Index Position '1'
		{
			if(array[i]==array[j])                  
			System.out.println(array[j]);
			
		}
	   }
	}
}

