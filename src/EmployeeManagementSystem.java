//
import java.util.Scanner;
public class EmployeeManagementSystem {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        String n = input.nextLine();
        System.out.println("Name is "+n);

        Employee empl1 = new Employee();
        empl1.setName(n);
        System.out.println("from the Obj Name is "+
                empl1.getName());



    }
}
