package HW;
import java.util.*;

public class PositiveOrNot {
 public static void main(String []ar)   
 {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter any integer no to check (-)ve or (+)ve");
    int number = scan.nextInt();

    if(isPositive(number))
    System.out.println(number+" is positive.");
    else 
    System.out.println(number+" is negative.");
 }
 private static boolean isPositive(int number)
 {
   return number>0;
 }
}
