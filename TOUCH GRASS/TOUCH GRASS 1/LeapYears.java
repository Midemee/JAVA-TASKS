public class LeapYears {
    public static void main(String[] args) {
    
        int count = 0;
        
        for (int year = 2000; year <= 2100; year++) { 
        
            if (year % 400 == 0) {
                System.out.print(year + " "); 
                count++;
               
            }
       }
    
    }
}
