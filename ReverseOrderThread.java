//QUESTION NO: 2

package Adarsh;  // Define the package "Adarsh"

public class ReverseOrderThread extends Thread {  // Define a class named "ReverseOrderThread" that extends the Thread class
	@Override
	public void run() {  // Override the run() method from the Thread class
		System.out.print("Reverse Order: ");  // Print the initial part of the message
		for (int i = 9999; i >= 1; i--) {  // Loop from 9999 to 1 in reverse order
			System.out.print(i + " ");  // Print the current value of "i" followed by a space
		}
		System.out.println();  // Move to the next line after printing the numbers
	}
}  
