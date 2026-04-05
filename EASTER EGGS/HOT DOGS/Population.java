import java.util.Scanner;
public class Population{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	int presentPopulation =312032486;
	int birthRate = 7;
	int deathRate =13;
	int immigrant = 45;
	int secPerYear = 365 * 24 * 60 * 60;
	int birthPerYear = secPerYear / birthRate;
	int deathPerYear = secPerYear / deathRate;
	int immigrantPerYear = secPerYear / immigrant;
	
	int population = birthPerYear + immigrantPerYear - deathPerYear;
	

	System.out.print("Enter number of years: ");
	int years= input.nextInt();
	years = years * population;

	System.out.println("Population is " + years);

    }
}