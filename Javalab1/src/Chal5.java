//Challenge 5

import java.util.Scanner;

public class Chal5
{
 
 public static void main( String[] args )
 {
   
  Scanner input = new Scanner( System.in );
 
  double number1;
  double number2;
  double number3;
  double answer;
 
  System.out.print( "Please enter your first number: " );
  number1 = input.nextDouble();
 
  System.out.print( "Please enter your second number: ");
  number2 = input.nextDouble();
 
  System.out.print( "Please enter your third number: ");
  number3 = input.nextDouble();
 
  answer = (number1 + number2) * number3;
 
  System.out.printf( "The answer is %s",answer );
     
 }
}