package HW;
import java.util.*;

public class PrimeOrNot {
    private static boolean isPrime(int number)
    {
        for(int i=2; i*i<= number; i++)
        {
            if(number %i ==0)
            return false;
        }
        if(number <=1)
        return false;
        else
        return true;
    }
        public static void main(String a[])
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter any no to check prime or not: ");
            int number= scan.nextInt();

            if(isPrime(number))
            System.out.print(number+" is a prime no.");
            else
            System.out.print(number+" is not a prime no.");            
        }
}
