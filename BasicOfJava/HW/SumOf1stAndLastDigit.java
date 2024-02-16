package HW;
import java.util.*;

public class SumOf1stAndLastDigit {
        public static void main(String arr[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any 4 digit integer no: ");
        int number = scan.nextInt();

        if(number>=1000 && number<=9999)
        {
            int firstDigit= number/1000;
            int lastDigit = number% 10;
            int sum = firstDigit + lastDigit;

            System.out.println("Sum of first and last digit is: "+sum);
        }else
        System.out.println("Invalid 4 digit integer no.");
    }
}
