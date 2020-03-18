// import scanner
import java.util.Scanner;


public class EmployeeManagementSystem {
    public static void main(String [] args){
        //creating scanner object to be used to get input from the user
        Scanner input = new Scanner(System.in);
        // a message to the console to prompt the user to enter their name
        System.out.println("Enter Name");

        String n = input.nextLine();// this is the line that gets the input from the user and store it in a variable n

        System.out.println("Name is "+n); // this line test if we are endeed the input we are getting from the user is stored in the variable n

        //creating an object empl1 from a class Employee by calling a no args constuctor
        Employee empl1 = new Employee();
        // set the name attribute of the object to be what was stored in the variable 'n'
        empl1.setName(n);
        //printing the name of the employee using set method
        System.out.println("from the Obj Name is "+ empl1.getName());
    }
}
