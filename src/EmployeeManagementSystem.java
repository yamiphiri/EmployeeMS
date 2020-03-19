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

        //decraring an array to hold number of hours for five day
        double [] workingHours = new double[5];
        // loop to get number of hours
        for (int i = 0; i <workingHours.length ; i++) {
            // since arrays are zero based but number of days start with 1 this will make sure that the number of days are starting from 1 to 5 while th loop is counting from 0 to 4
            int day = i+1;
            //telling the user to enter the number of days
            System.out.println("enter your number of working hours at day "+ day );
            // getting the number of day and keeping them in an array
            workingHours[i] =input.nextDouble();
        }
        //passing the array 'woringHours' to a method in the emp1 object that expects an array in order to set working hours
        empl1.setNumberOfWorkingHours(workingHours);

        //calculating the total hours: this must be implemented in empleyees class not here
        double totalWorkingHours = 0;
        for (int i = 0; i <empl1.getNumberOfWorkingHours() .length ; i++) {
            totalWorkingHours =totalWorkingHours + empl1.getNumberOfWorkingHours() [i];
        }
        //printing amount to pay our employee
        System.out.println( empl1.getName() +" your total working hours is "+totalWorkingHours+" you payement amounts to K"+empl1.getPay());


    }
}
