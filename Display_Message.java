//QUESTION NO: 1

package Adarsh;  // Define the package "Adarsh"

public class Display_Message extends Thread {  // Define a class named "Display_Message" that extends the Thread class
	
	String msg;  // Declare a variable "msg" of type String to hold the message

	public Display_Message(String message) {  // Constructor that takes a String parameter "message"
		this.msg = message;  // Initialize the instance variable "msg" with the value of the parameter "message"
		
	}
	
	@Override
	public void run() {  // Override the run() method from the Thread class
		 while(true) {  // Enter an infinite loop
			 System.out.println(msg);  // Print the value of the "msg" variable
			 
		 }
	}
	

} 