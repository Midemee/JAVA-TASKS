// Exercise 4.25: Mystery2.java
 public class Mystery2 {
 public static void main(String[] args) {
 int count = 1;

 while (count <= 20) {
 System.out.println(count % 3 == 1 ? "########" : "++++++++");
 ++count;
 } // end while
 } // end main
 } // end class Mystery

//So it prints ######## only when the remainder is 1, and ++++++++ for everything else (remainder 0 or 2).
