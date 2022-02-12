import java.util.Scanner;

public class Chal2 {
 public static void main( String[] args ) {
   
  Scanner input = new Scanner( System.in );
 
  String firstname;
  String surname;
 
  System.out.print( "Enter your firstname: " );
  firstname = input.nextLine();
 
  System.out.print( "Enter your surname: " );
  surname = input.nextLine();
 
  System.out.printf( "Hello %s %s", firstname,surname );
 }
}