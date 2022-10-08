package com.promineo.tech;

public class App {

	public static void main(String[] args) { //Beginning of main method
		
	//10. In this class instantiate an instance of each of your logger classes that implement the Logger interface.
	//11. Test both methods on both instances, passing in Strings of your choice.

			
			AsteriskLogger asteriskLogger = new AsteriskLogger();
		
			SpacedLogger spacedLogger = new SpacedLogger();
			
			
			
			asteriskLogger.log("Hello"); // Call the asteriskLogger log() and enter a string of "Hello"
			
			asteriskLogger.error("Mistake" // Call the asteriskLogger error() and enter a string of "Error!"
					+ "!");
		
			
			
			
			spacedLogger.log("Hello!");	// Call the spacedLogger log() and enter a string of "Hello!"
			
			spacedLogger.error("Error!"); // Call the spacedLogger error() and enter a string of "Error!"
	
		
	}

} // End of main method
