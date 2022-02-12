//challenge 8

import java.util.Scanner;

public class Chal8
{
 
 public static void main( String[] args )
 {
   
  Scanner input = new Scanner( System.in );
 
  double bill;
  double people;
  double each;
 
  System.out.print( "What is the total cost of the bill?: " );
  bill = input.nextDouble();
 
  System.out.print( "How many people are there? ");
  people = input.nextDouble();
 
  each = bill / people;
 
  System.out.printf( "Each person should pay & %s", each );
     
 }
}
