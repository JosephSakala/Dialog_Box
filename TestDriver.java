/*------------------------------------
 *Name: Joseph Sakala                 *
 * Unit 10                            *
 * GUI
 * Exercise question 1
 * SIN: 21162450
 * 
 *-----------------------------------*/


import javax.swing.JOptionPane;//needed for the dialog boxes


public class DialogEx{

    public static void main(String []args){

        Employeee Obj = new Employeee(null, 0, 0);
        String Name;

       // Name = JOptionPane.showInputDialog("Enter name");


      //  Obj.setName(Name);

        double firstNumber = 0.0, secondNumber = 0.0, Product = 0.0;

        firstNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first number"));
        secondNumber =  Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));

        Product = firstNumber*secondNumber;

        JOptionPane.showMessageDialog(null, "Your product is "+ Product);

    

    }
}


