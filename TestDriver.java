 //import java.util.*;//needed for the scanner class
 import javax.swing.*;//needed for dialog boxes
 
 class Employee{

    //these are instance variables
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

    //this is a constructor
    public Employee(String employeeName, String employeeNumber, String hireDate){
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    //mutatas
    public void setEmployeeNumber(String employeeNumber){
        this.employeeNumber =employeeNumber;

    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;

    }
    public void setHireDate(String hireDate){
        this.hireDate = hireDate;

    }

    //Accessors
    public String getEmployeeName(){
        return employeeName;
    }
    
    public String getEmployeeNumber(){
        return employeeNumber;

    }
    public String getHireDate(){
        return hireDate;
    }

}

class ProductionWorker extends Employee{

    //instance variables
    private int shift;
    private double HourlyPayRate;

    public ProductionWorker(String employeeName, String employeeNumber, String hireDate, int shift, double HourlyPayRate){
        super(employeeName, employeeNumber, hireDate);
        this.HourlyPayRate = HourlyPayRate;
        this.shift = shift;
    }

    //mutatas
    public void setShift(int shift){
        this.shift = shift;  

    }
    public void setHourlyPayRate(double HourlyPayRate){
        this.HourlyPayRate = HourlyPayRate;
        
    }

    //Accessors
    public int getShift(){
        return shift;

    }
    public double getHourlyPayRate(){
        return HourlyPayRate;
    }
    
}

public class TestDriver{

    public static void main(String []args){

        //Scanner UserInput = new Scanner(System.in);//creating a scanner object = 'userInput' to read user input

        //creating an object that will access both Employee's class and ProductionWorker
        ProductionWorker Employees = new ProductionWorker(null, null, null, 0, 0);

        String name = " ";//Employee name
        String title = "Employee details";//dialog box title
        String eNumber = " ";//Employee number

       name = JOptionPane.showInputDialog(null,"Enter your full names",title, JOptionPane.INFORMATION_MESSAGE);
        Employees.setEmployeeName(name);

        eNumber = JOptionPane.showInputDialog(null, "Enter your Social Security number", title, 0);
        Employees.setEmployeeName(eNumber);

        String date;
        date = JOptionPane.showInputDialog(null, "Date employee was hired", title, 0);
        Employees.setHireDate(date);


        JOptionPane.showMessageDialog(null,Employees.getEmployeeName());


       /*int num1 = 0, num2 = 0, sum = 0;
        
       for(int i = 0; i<3;i++){

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter num1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter num2"));

         sum = num1 + num2;

         JOptionPane.showMessageDialog(null,sum);


       }
       */




    }
    
}