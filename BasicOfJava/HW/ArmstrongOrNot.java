package HW;
import java.util.*;

public class ArmstrongOrNot {
    public static boolean isArmstrong(int number)
    {
        int originalNum = number;
        int sum =0;
        int  numDigits =(int) Math.log10(number)+1;

        while(number!=0)
        {
            int digit = number %10;
            sum+=Math.pow(digit, numDigits);
            number /=10;
        }
        return sum==originalNum;
    }
    public static void main(String arr[])
    {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter any no to check armstrong or not: ");
        int number= scan.nextInt();

        if(isArmstrong(number))
        System.out.println(number+" is armstrong.");
        else
        System.out.println(number+" is not an armstrong.");
    }
}
