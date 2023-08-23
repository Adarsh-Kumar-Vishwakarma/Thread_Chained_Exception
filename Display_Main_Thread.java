//QUESTION NO: 1

package Adarsh;  // Define the package "Adarsh"

public class Display_Main_Thread {  // Define a class named "Display_Main_Thread"

	public static void main(String[] args) {  // Main method that serves as the entry point of the program
		// Create a new instance of Display_Message and initialize it with the message "You Want To Stop This Loop"
		Display_Message obj1 = new Display_Message("You Want To Stop This Loop");
		// Create a new instance of Display_Message and initialize it with the message "Press ctrl + C in Terminal"
		Display_Message obj2 = new Display_Message("Press ctrl + C in Terminal");
		
		obj1.start();  // Start the first Display_Message thread
		obj2.start();  // Start the second Display_Message thread

	}

}  
