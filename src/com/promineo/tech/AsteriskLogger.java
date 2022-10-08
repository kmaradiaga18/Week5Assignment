package com.promineo.tech;

public class AsteriskLogger implements Logger{

	
	//4. The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String  
	
	@Override
	public void log(String a) {
		System.out.println("***" + a + "***"); // creating a string and adding "***" on each side.
	}

	
	//5. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”
	
	@Override
	public void error(String word) {
		String error = "Error: " + word;				
		int starCount = error.length() + 6; //adding six to account for three stars on either side of Error message 
		
		StringBuilder starBox = new StringBuilder(); //choosing string builder so it is able to adjust with word plugged into method
		
		for (int i = 1; i <= starCount; i++) { // USe a for loop to iterate though length of word. Append the * to the string  
			starBox.append('*');
		}
	
		System.out.println(starBox.toString()); //manually printing line of * to create box
		
		log(error); // Plugging in error in log().
		
		System.out.println(starBox.toString());//manually printing line of * to create box
			
			
		

	}

}
