//Challenge 1

import java.util.Scanner;

public class Chal1 {
 public static void main( String[] args ) {
   
  Scanner input = new Scanner( System.in );
 
  String firstname;
 
  System.out.print( "Enter your firstname: " );
  firstname = input.nextLine();
 
  System.out.printf( "Hello %s", firstname );
 }
}
