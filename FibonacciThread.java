//QUESTION NO: 2

package Adarsh;  // Define the package "Adarsh"

public class FibonacciThread extends Thread {  // Define a class named "FibonacciThread" that extends the Thread class
	@Override
	public void run() {  // Override the run() method from the Thread class

		int n = 20, i, n1 = 0, n2 = 1, temp;  // Declare and initialize variables for Fibonacci calculation

		System.out.print("Fibonacci series: ");  // Print the initial message
		for (i = 0; i <= n; i++) {  // Loop from 0 to n (inclusive)
			System.out.print(n1 + "  ");  // Print the current value of "n1" followed by two spaces
			temp = n1;  // Store the value of n1 in the temporary variable "temp"
			n1 = n2;  // Assign the value of n2 to n1
			n2 = temp + n2;  // Calculate the next value of n2 as the sum of temp and n2

		}
		System.out.println();  // Move to the next line after printing the Fibonacci series
	}

}  
