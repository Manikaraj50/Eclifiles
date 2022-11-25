package org.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListString {
	
	static void display(Set<Integer> f)
	{
		f.add(12);
		f.add(34);
		f.add(45);
		System.out.println(f);
		
	}
	
	public static void main(String[] args) {
		  
       // Set<Integer> set1 = new HashSet<Integer>();    
      //  set1.addAll(Arrays.asList(A));    
      //  Set<Integer> set2 = new HashSet<Integer>();    
      //  set2.addAll(Arrays.asList(B));   
     //   System.out.println(set1);
		Set f =new TreeSet();
		display(f);
		
		
		
		
        
       
        
		
	}


	

}
