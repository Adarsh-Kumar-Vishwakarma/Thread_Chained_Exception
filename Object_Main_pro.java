//QUESTION NO: 4

package Adarsh;  // Define the package "Adarsh"

public class Object_Main_pro {  // Define a class named "Object_Main_pro"

    public static void main(String[] args) {  // Main method that serves as the entry point of the program
        try {  // Start a try block to handle exceptions
            // Create a new instance of Checking_Object (object) and assign it to the variable obj1
            Checking_Object obj1 = new Checking_Object();  // This will succeed
            // Create a new instance of Checking_Object (object) and assign it to the variable obj2
            // Uncommenting this line will throw an exception
            //Checking_Object obj2 = new Checking_Object();
        } catch (One_Object_Excep ex) {  // Catch the One_Object_Excep exception if it occurs
            System.out.println(ex);  // Print the exception message
        }
    }

}  
