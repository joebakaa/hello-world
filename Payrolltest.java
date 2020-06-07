
package payroll;
import javax.swing.JOptionPane;

public class Payrolltest {

    
    public static void main(String[] args) {
        
    String userInputString;
    String userName;
    int userId;
    double userHourlyPayRate;
    double userHoursWorked;
    String outputString;
    
    userName = JOptionPane.showInputDialog("Enter the name of this payroll: ");
    userInputString = JOptionPane.showInputDialog("Enter the id number of " + userName + ":");
    userId = Integer.parseInt(userInputString);
    userInputString = JOptionPane.showInputDialog("Enter the hourly pay rate of " + userName + ":");
    userHourlyPayRate = Double.parseDouble(userInputString);
    userInputString = JOptionPane.showInputDialog("Enter the hours worked: ");
    userHoursWorked = Double.parseDouble(userInputString);
    
    
    Payroll payroll1 = new Payroll( userName , userId);
    payroll1.setHourlyPayRate(userHourlyPayRate);
    payroll1.setHoursWorked(userHoursWorked);
    outputString = String.format("%s has a gross pay of $%,.2f", payroll1.getName(), payroll1.calculateGrossPay());
    JOptionPane.showMessageDialog(null, outputString);
    System.out.println(payroll1.getName()+ " Has a gross pay of: " + payroll1.calculateGrossPay());
    }
    
}
