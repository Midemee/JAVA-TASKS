/*4.17 GAS MILEAGE
PSEUDOCODE
TOP LEVEL
 Collect inputs from user for miles driven and gallon used, store each in variables
 Then loop over the miles and gallons used and calculate the miles per gallon
 calculate the total miles driven and total gallons used for each trip
 Print out the combined miles per gallon

STEP-WISE
 
Initialize totalMiles to 0
Initialize totalGallons to 0
Initialize tripCounts to 0

Prompt user to enter miles driven or -1 to quit
Input the miles driven 

While miles is not equal to -1
prompt the user to enter the gallons used
Input the gallons used
Initialize miles per gallon
Add each mile to totalMiles
Add each gallon to totalGallons
Increase tripcount by 1

Print of the total miles per gallon
Initialize combined miles per gallon

Prompt user to enter miles driven or -1 to quit
Input the miles driven 

If the tripcount is strictly equal to zero
Print out a message
Else, print out other messages*/

import java.util.Scanner;
public class MileAge{
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 int totalMiles = 0;
 int totalGallons = 0;
 int tripCount = 0;

 System.out.print("Enter the miles driven or -1 to quit: ");
 int miles = input.nextInt();

 while(miles != -1) {
   System.out.print("Enter the gallons: ");
   int gallons = input.nextInt();
   double mpg = (double) miles / gallons;
   totalMiles += miles;
   totalGallons += gallons;
   tripCount ++;
   System.out.printf("The total number of miles per gallon is %.2f%n", mpg);
   double combinedMpg = (double) totalMiles / totalGallons;
   System.out.printf("The combined mile per gallon is %.2f%n", combinedMpg);
   
   System.out.print("Enter the miles driven or -1 to quit: ");
   miles = input.nextInt();
 }

 if(tripCount == 0) {
   System.out.println("No trips was recorded");
}
else {
   System.out.printf("The total trips is: %d%n", tripCount);
   System.out.printf("The total miles driven is: %d%n", totalMiles);
   System.out.printf("The total gallons used is: %d%n", totalGallons);
   System.out.printf("The final combined mile per gallon is: %.2f MPG %n", (double) totalMiles / totalGallons);
}
}
}
