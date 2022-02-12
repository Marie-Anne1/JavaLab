//Challenge 13

import java.util.Scanner;

public class Chal13
{
 public static void main( String[] args )
 {
   
  Scanner input = new Scanner( System.in );
 
  System.out.print( "Enter a value less than 20: \n" );
  int num = input.nextInt();
 
  if (num >= 20)
 
     System.out.printf("Too high");
     
  else
 
     System.out.printf("Thank you");
 }
}
