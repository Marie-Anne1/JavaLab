//Challenge 12

import java.util.Scanner;

public class Chal12
{
 public static void main( String[] args )
 {
   
  Scanner input = new Scanner( System.in );
 
  System.out.print( "Enter first number: " );
  int num1 = input.nextInt();
 
  System.out.print( "Enter second number: " );
  int num2 = input.nextInt();
 
  if (num1 > num2)
 
     System.out.printf("%d\n%d", num2, num1 );
       
  else
 
     System.out.printf("%d\n%d\n", num1, num2);
 }
}
