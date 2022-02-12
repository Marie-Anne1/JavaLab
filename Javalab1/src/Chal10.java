//challenge 10

import java.util.Scanner;

public class Chal10
{
 
 public static void main( String[] args )
 {
   
  Scanner input = new Scanner( System.in );
 
  System.out.print( "Enter the number of kilos: " );
  double kilo = input.nextDouble();
 
  double pound = kilo * 2.204;
 
  System.out.printf( "That is %s %s",pound,"pounds");
 
 }
}