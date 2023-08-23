//QUESTION NO: 2

package Adarsh;  // Define the package "Adarsh"

public class Fibonacci_Reverse_Thread {  // Define a class named "Fibonacci_Reverse_Thread"

	public static void main(String[] args) {  // Main method that serves as the entry point of the program
		FibonacciThread F = new FibonacciThread();  // Create an instance of FibonacciThread named F
		F.start();  // Start the FibonacciThread

		ReverseOrderThread R = new ReverseOrderThread();  // Create an instance of ReverseOrderThread named R
		R.start();  // Start the ReverseOrderThread

		
			try {  // Start a try block to handle InterruptedException
				Thread.sleep(30000);  // Sleep the thread for 20000 milliseconds (30 seconds)
			} catch (InterruptedException e) {  // Catch the InterruptedException if it occurs
				
				e.printStackTrace();  // Print the stack trace of the exception
			}
			
			System.exit(0);  // Terminate the Java Virtual Machine with status code 0
		

	}

}  
