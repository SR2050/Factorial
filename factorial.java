import java.util.Scanner;
public class Factorial {

  public static long findFactorial(int number){

     // declare variable
     long fact = 1;

     for(int i=1; i<=number; i++) {
       fact = fact * i;
     }

     return fact;
  }

  public static void main(String[] args) {

     // declare variables
     int number = 0;
     long result = 0;

     //create Scanner class object
     // to take input
     Scanner scan = new Scanner(System.in);

     // take input from end-user
     System.out.print("Enter integer number:");
     number = scan.nextInt();

     // Find the factorial of 
     // the given number
     result = findFactorial(number);

     // display result
     System.out.println("Factorial = "+ result);

     // close Scanner class object
     scan.close();
  }
}