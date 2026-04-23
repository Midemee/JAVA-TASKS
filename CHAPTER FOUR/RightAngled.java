/*4.30 (Right-angled Triangle) Write an application that prompts the user to enter the length of
the base of a triangle, and uses that to draw a right-angled triangle composed of asterisks. Your
program should work for triangles of base lengths between 1 and 10*/

import java.util.Scanner;
public class RightAngled{
    public static void main(String[] args){
        Scanner inputEntry = new Scanner(System.in);
            System.out.print("Enter the base length (1-10): ");
            int base = inputEntry.nextInt();

            while(base < 1 || base > 10){
                System.out.print("Invalid base, enter a base between 1-10: ");
                base = inputEntry.nextInt();
            }

            for(int row = 1; row <= base; row++){
                for(int column = 1; column <= row; column++){
                System.out.print("*");
                }
            System.out.println();            
        }

    }
}
