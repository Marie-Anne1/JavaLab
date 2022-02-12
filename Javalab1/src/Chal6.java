//challenge 6

import java.util.Scanner;

public class Chal6
{
 
 public static void main( String[] args )
 {
   
  Scanner input = new Scanner( System.in );
 
  int startNum;
  int endNum;
  int slicesLeft;
 
  System.out.print( "Enter the number of slices of pizza you started with: " );
  startNum = input.nextInt();
 
  System.out.print( "How many slices have you eaten? ");
  endNum = input.nextInt();
 
  slicesLeft = startNum - endNum;
 
  System.out.printf( "You have %s %s",slicesLeft,"slices remaining" );
     
 }
}
