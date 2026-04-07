import java.util.Scanner;
public class Grade{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter Grade from A-F: ");
	String grade= input.nextLine();

	if (grade.equalsIgnoreCase("A")) {
	System.out.println(4.0);
	}
	else if (grade.equalsIgnoreCase("B")) {
	System.out.println(3.0);
	}
	else if (grade.equalsIgnoreCase("C")) {
	System.out.println(3.0);
	}
	else if (grade.equalsIgnoreCase("D")) {
	System.out.println(2.0);
	}
	else if (grade.equalsIgnoreCase("E")) {
	System.out.println(1.0);
	}
	else if (grade.equalsIgnoreCase("F")) {
	System.out.println(0.0);
	}
	else {
	System.out.println("Invalid Input");
	}

    }
} 