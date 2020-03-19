/**
 * class to implement a blueprint of employee
 * */
public class Employee {
    //object attribute
    private String name;
    private double [] numberOfWorkingHours;
    private final double  rate =12;
    //no args construtor
    public Employee(){

    }
    // method to update variable name
    public void setName(String name) {
        this.name = name;
    }
    //method to retrieve variable name
    public String getName() {
        return name;
    }

    // this method set number of working hours for the object
    // it si made to receive an array as a parameter declared in this case ad double [] workingHours
    public void setNumberOfWorkingHours(double[] numberOfWorkingHours) {
        this.numberOfWorkingHours = numberOfWorkingHours;
    }
    //this method return or retrieves or get number of working hours of the employee
    //its return type is double [] meaning that it is expected to return an array containing element of double data type in this case working hours
    public double[] getNumberOfWorkingHours() {
        return numberOfWorkingHours;
    }
    //this method calculate pay of the employee
    public double getPay(){
        double total = 0;
        for (int i = 0; i <this.numberOfWorkingHours.length ; i++) {
            total =total + this.numberOfWorkingHours[i];


        }
        /* you can also implement it as this
        for (int i = 0; i <getNumberOfWorkingHours().length ; i++) {
            total =total + getNumberOfWorkingHours()[i];

        }*/
        return this.rate * total;

    }

}
