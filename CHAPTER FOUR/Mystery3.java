// Exercise 4.26: Mystery3.java
 public class Mystery3 {
 public static void main(String[] args) {
 int row = 5;

 while (row >= 1) {
 int column = 5;

 while (column >= 1) {
 System.out.print(row % 2 == 0 ? "X" : "O");
 ++column;
 } // end while

 --row;
 System.out.println();
 } // end while
 } // end main
 } // end class Mystery3

/*There's a bug in the code,  ++column increases column instead of decreasing it, so column will never reach 0 and the inner loop runs infinite.
Outer loop controls the rows (counts down 5→1)
Inner loop controls the columns (prints 5 characters per row)
row % 2 == 0 decides whether to print X or 0 for the entire row
System.out.println() moves to the next line after each row is done
