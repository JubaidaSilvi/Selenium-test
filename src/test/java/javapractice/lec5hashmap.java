package javapractice;

import java.util.HashMap;

public class lec5hashmap {

	public static void main(String[] args) {

	HashMap<String, String> CapitalCities = new HashMap<String, String>(); 
	
	CapitalCities.put("Detroit", "MI");
    CapitalCities.put("Irving", "TX");
    CapitalCities.put("New York", "NY");
    CapitalCities.put("Los Angeles", "CA");
    
    //Access the item
    { CapitalCities.get("Los Angeles");}
		
		
	}

}
