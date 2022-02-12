//Challenge 7

import java.util.Scanner;

public class Chal7
{
 
 public static void main( String[] args )
 {
   
  Scanner input = new Scanner( System.in );
 
  String name;
  int age;
  int newAge;
 
  System.out.print( "What is your name: " );
  name = input.nextLine();
 
  System.out.print( "How old are you?: ");
  age = input.nextInt();
 
  newAge = age + 1;
 
  System.out.printf( name + ", next birthday you will be " + newAge);
     
 }
}
