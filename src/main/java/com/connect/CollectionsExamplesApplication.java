package com.connect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionsExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionsExamplesApplication.class, args);
		
		
		 List<String> countries = new ArrayList<String>();
	        
	        countries.addAll(Arrays.asList("Australia","Canada","India","USA"));
	                        
	        countries.remove(new String("USA"));
	        
	        System.out.print(countries.size());
	 
	        List<Employee> empList = new ArrayList<Employee>();
	        
	        empList.add(new Employee(1,"A"));
	        empList.add(new Employee(1,"B"));
	        empList.add(new Employee(1,"C"));
	                        
	        empList.remove(new Employee(1,"A"));
	        
	        System.out.println(empList.size());
	        

	        System.out.println("------------------------");
	        Integer i1 = -127;
	        Integer i2 = -127;
	        Integer i3 = 127;
	        Integer i4 =127;
	        System.out.println((i1==i2) + "," + (i3==i4));
	}

}
