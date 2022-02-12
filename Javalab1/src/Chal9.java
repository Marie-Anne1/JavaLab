//challenge 9

import java.util.Scanner;

public class Chal9
{
 
 public static void main( String[] args )
 {
   
  Scanner input = new Scanner( System.in );
 
  System.out.print( "Enter the number of days: " );
  int days = input.nextInt();
 
  int hours = days * 24;
  int minutes = hours * 60;
  int seconds = minutes * 60;
 
  System.out.println( "In "+days+" days there are...\n" +hours+"hours, " +minutes+"minutes, " + seconds+"seconds.");
 
 }
}

