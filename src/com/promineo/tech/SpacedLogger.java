package com.promineo.tech;

public class SpacedLogger implements Logger{

	
	//7. If the log method received “Hello” as an argument, it should print H e l l o
	
	@Override
	public void log(String a) {
		
	StringBuilder log = new StringBuilder(); // create a new string builder 
		
		for (int i = 0; i < a.length(); i++) { // for loop to iterate through the length of a parameter thats placed here
		
		log.append(a.charAt(i) + " ");        // we are appending to string (log) starting at i (o) and at each character we will add " " 
		}
	System.out.println(log); // prints log
	}

	
	// 8. The error method should do the same, but with “ERROR:” preceding the spaced out input 
	
	@Override
	public void error(String error) {
		
	System.out.print("ERROR: "); // We are printing ERROR as string
			
	log(error); // error(). encapsulating into log (). 
		
		
	
		}
		
}
	