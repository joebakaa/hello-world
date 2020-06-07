package payroll;

public class Payroll {
        private String name;
        private int idNumber;
        private double hourlypayrate;
        private double hoursworked;
        
        public String getName(){
            return name;
        }
        
        public int getIdNumber(){
            return idNumber;
        }
        
        public double getHourlyPayRate(){
            return hourlypayrate;
        }
        
        public double getHoursWorked(){
            return hoursworked;
        }
        
        public void setName(String nameGiven){
            name = nameGiven;
        }
        
        public void setIdNumber(int idNumberGiven){
            idNumber = idNumberGiven;
        }
        
        public void setHourlyPayRate(double hourlypayrateGiven){
            hourlypayrate = hourlypayrateGiven;
        }
        
        public void setHoursWorked(double hoursworkedGiven){
            hoursworked = hoursworkedGiven;
        }
        
        public double calculateGrossPay(){
            return hoursworked * hourlypayrate;
        } 
        public Payroll(String nameGiven, int idNumberGiven){
            name = nameGiven;
            idNumber = idNumberGiven;
            hourlypayrate = 7.25;
            hoursworked = 0;
        }
    /**
     * @param args the command line arguments
     */
   
        // TODO code application logic here
    
    
}
