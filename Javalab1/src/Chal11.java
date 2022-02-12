//challenge 11

import java.util.Scanner;

public class Chal11
{
 
 public static void main( String[] args )
 {
   
  Scanner input = new Scanner( System.in );
 
  System.out.print( "Enter a number over 100: " );
  int larger = input.nextInt();
 
  System.out.print( "Enter a number under 10: " );
  int smaller = input.nextInt();
 
  int answer = larger % smaller;
 
  System.out.println( smaller+" goes into "+larger+answer+" times");
 
 }
}