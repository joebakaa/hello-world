
package bankcharge;

import java.util.Scanner;

public class BankCharge {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of checks that you wrote this month");
        double x = input.nextDouble();
        if(x < 20){
            x = x * .1 + 10;
            System.out.println(x + " This is your bank charge for the month");
        } else if(x < 40 ){
            x = x * .08 + 10;
            System.out.println(x + " This is your bank charge for the month");
        }else if(x <60){
            x = x * .06 + 10;
            System.out.println(x + " This is your bank charge for the month");
        }else if(x > 60){
            x = x * .04 + 10;
            System.out.println(x + " This is your bank charge for the month");
        }else{
            System.out.println("Incorrect amount");
        }
        
       
    }
    
}
