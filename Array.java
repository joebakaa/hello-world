
package pkg2d.array;
import java.io.*;
import java.util.Scanner;

        
public class Array {

    public static void main(String[] args) {
        
        int[][]XYZ={
                    {55000,75000,45000,80000},
                    {35000,38000,42000,50000},
                    {40000,42000,22000,38000},
                    {80000,73000,78000,77500}};
        Scanner scanner = new Scanner(System.in);
        
        
        //Division total
        //
        //
        System.out.println("For which division would you like to know its 4 quarter total? Enter A-D");
        String row =scanner.next();
        switch (row.toUpperCase()) {
            case "A":
                System.out.println("Division total: "+getRowTotal(XYZ,0));
                break;
            case "B":
                System.out.println("Division total: "+getRowTotal(XYZ,1));
                break;
            case "C":
                System.out.println("Division total: "+getRowTotal(XYZ,2));
                break;
            case "D":
                System.out.println("Division total: "+getRowTotal(XYZ,3));
                break;
            default:
                System.out.println("Data entered does not match any division");
                break;
        }
        
        //Qaurterly total
        System.out.println("Which quarter would you like to know its total for all divisons? Please enter 1-4");
        int one =scanner.nextInt();
        //deducted one to fit the apparands 
        one = one -1;
        System.out.println("Quarterly total is: " + getColumnTotal(XYZ,one));
        //
        //
        
        //Highest in the row
        System.out.println("For which division would you like to know its highest quarter?");
        String lol = scanner.next();
        switch (lol.toUpperCase()) {
            case "A":
                System.out.println("Highest quarter: "+getHighestinRow(XYZ,0));
                break;
            case "B":
                System.out.println("Highest quarter: "+getHighestinRow(XYZ,1));
                break;
            case "C":
                System.out.println("Highest quarter: "+getHighestinRow(XYZ,2));
                break;
            case "D":
                System.out.println("Highest quarter: "+getHighestinRow(XYZ,3));
                break;
            default:
                System.out.println("Data entered does not match any division");
                break;
        }
        
        //Lowest in row        
        System.out.println("For which division would you like to know its lowest quarter?");
        String rajiv = scanner.next();
        switch (rajiv.toUpperCase()) {
            case "A":
                System.out.println("Lowest Quarter: "+getLowestinRow(XYZ,0));
                break;
            case "B":
                System.out.println("Lowest Quarter: "+getLowestinRow(XYZ,1));
                break;
            case "C":
                System.out.println("Lowest Quarter: "+getLowestinRow(XYZ,2));
                break;
            case "D":
                System.out.println("Lowest Quarter: "+getLowestinRow(XYZ,3));
                break;
            default:
                System.out.println("Data entered does not match any division");
                break;
        }
        //
        //

        
        System.out.println("Which divsion wuld you like to compare qaurters with?");
String joe = scanner.next();
System.out.println("Which qaurter wuld you like to compare increase or decrease for?");
int ben = scanner.nextInt();
switch (joe.toUpperCase()) {
            case "A":
                System.out.println("Change for division " + joe.toUpperCase()+" for quarter " + ben + " is " + getQuarterlyIncDec(XYZ,0,ben));
                break;
            case "B":
                System.out.println("Change for division " + joe.toUpperCase()+" for quarter " + ben + " is " + getQuarterlyIncDec(XYZ,1,ben));
                break;
            case "C":
                System.out.println("Change for division " + joe.toUpperCase()+" for quarter " + ben + " is " + getQuarterlyIncDec(XYZ,2,ben));
                break;
            case "D":
                System.out.println("Change for division " + joe.toUpperCase()+" for quarter " + ben + " is " + getQuarterlyIncDec(XYZ,3,ben));
                break;
            default:
                //System.out.println("Data entered does not match any division");
                break;
        //System.out.println("Quarterly Increase or Decrease: "+getQuarterlyIncDec(XYZ,));
        
}
System.exit(0);
        
    }
    
    
    
    //Gets
    public static int getRowTotal(int [][]numbers, int index){
    int tot = 0;
        
    for (int col=0;col<4;col++)    
     tot+=numbers[index][col];  
    return tot;    
    }
    public static int getColumnTotal(int [][]numbers, int index){
        int tot= 0;
        for(int row = 0; row<numbers.length;row++)
            tot+=numbers[row][index];
        
    return tot;
    }
    public static int getHighestinRow(int[][]numbers,int row){
    
    int high = numbers [row][0];
    for(int i=1;i<4;i++)
        if(numbers[row][i]>high)
            high=numbers[row][i];
    return high;    
    }
    public static int getLowestinRow(int[][]numbers,int row){
    int low= numbers[row][0];
    for(int i=1; i<4;i++)    
        if(numbers[row][i]<low)
            low=numbers[row][i];
    return low;
    }
    
    public static int getQuarterlyIncDec(int[][]numbers, int row, int Quarter){
        int change = numbers[row][Quarter-1]-numbers[row][Quarter-2];
       return change;
    }
    
}
