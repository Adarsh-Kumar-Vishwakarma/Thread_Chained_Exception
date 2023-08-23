//QUESTION NO: 4

package Adarsh;  // Define the package "Adarsh"

public class Checking_Object {  // Define a class named "Checking_Object"
    private static int count = 0;  // Declare a private static variable "count" and initialize it with 0

    Checking_Object() throws One_Object_Excep {  // Constructor with a throws declaration for One_Object_Excep
        if (count == 0) {  // Check if the count is 0
            System.out.println("Object created.");  // Print a message indicating that an object is created
            count++;  // Increment the count
        } else {
            // Throw a new instance of One_Object_Excep with the message "More than one object is not allowed."
            throw new One_Object_Excep("More than one object is not allowed.");
        }
    }
}  
