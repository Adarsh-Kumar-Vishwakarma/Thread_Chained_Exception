//QUESTION NO: 3

package Adarsh;  // Define the package "Adarsh"

class NoLeaveGrantedException extends Exception {  // Define a class named "NoLeaveGrantedException" that extends the Exception class
    public NoLeaveGrantedException(String message) {  // Constructor that takes a String parameter "message"
        super(message);  // Call the constructor of the parent class (Exception) with the provided message
    }
}

class TeamLeadUpsetException extends Exception {  // Define a class named "TeamLeadUpsetException" that extends the Exception class
    public TeamLeadUpsetException(String message) {  // Constructor that takes a String parameter "message"
        super(message);  // Call the constructor of the parent class (Exception) with the provided message
    }
}

public class Chained_Exception {  // Define a class named "Chained_Exception"
    public static void main(String[] args) {  // Main method that serves as the entry point of the program
        try {  // Start a try block to catch exceptions
            getLeave();  // Call the getLeave() method
        } catch (Exception e) {  // Catch any exception that occurs
            System.out.println(e.getMessage());  // Print the message of the caught exception
            if (e.getCause() != null) {  // Check if a chained exception exists
                System.out.println("Chained Exception message: " + e.getCause().getMessage());  // Print the message of the chained exception
            }
        }
    }

    public static void getLeave() throws NoLeaveGrantedException {  // Method that throws NoLeaveGrantedException
        try {  // Start a try block to catch exceptions
            howIsTeamLead();  // Call the howIsTeamLead() method
        } catch (TeamLeadUpsetException e) {  // Catch the TeamLeadUpsetException if it occurs
            throw new NoLeaveGrantedException("Leave not sanctioned. \n" + e);  // Throw a NoLeaveGrantedException with a message and the chained TeamLeadUpsetException
        }
    }

    public static void howIsTeamLead() throws TeamLeadUpsetException {  // Method that throws TeamLeadUpsetException
        throw new TeamLeadUpsetException("Team lead Upset.");  // Throw a TeamLeadUpsetException
    }
}
