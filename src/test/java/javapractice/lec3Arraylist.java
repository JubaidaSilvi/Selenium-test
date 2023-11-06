package javapractice;

import java.util.ArrayList;

public class lec3Arraylist {

	public static void main(String[] args) {
		// Array list resizeable
		//syntax:Arraylist<datatype>variable=new Arraylist <datatype>();
		
		//code of Arraylist
		ArrayList<String> cars = new ArrayList<String>();    // Create an ArrayList object
		
		//Add 4 data in Array list 
		
		cars.add("BMw");
		cars.add("Kia");
		cars.add("Nissan");
		cars.add("Honda");
		
		// access the item
		
        System.out.println(cars.get(0));
        
        // change
        
        
        System.out.println(cars.set(1,"Bently"));
        
        //


	       

	}

}
