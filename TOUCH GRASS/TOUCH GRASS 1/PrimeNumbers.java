public class PrimeNumbers {
    public static void main(String[] args) {
    
        int primes = 0;
        
        for (int number = 2; number <= 1200; number++) {
            int divisors = 0;
            
            for (int counter = 1; counter <= number; counter++) {
                if (number % counter == 0) {
                    divisors++;
                }
            }
               
               
            if (divisors == 2) {
                System.out.print(number + " "); 
                primes++;
                
                if (primes % 8 == 0) {
                    System.out.println(); 
                }
            }
        }
    }
}
