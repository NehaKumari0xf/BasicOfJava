package HW;
import java.util.*;

public class palindromeOrNot {
    public static boolean isPaliendrome(int number)
    {
        String numString = Integer.toString(number);//parse int to string ease comparision
        int left = 0;
        int right = numString.length()-1;

        while(left<right)
        {
            if(numString.charAt(left)!=numString.charAt(right))
            return false;
            left++;
            right--;
        }return true;
    }
    public static void main(String arr[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any no to check paliendrome or not: ");
        int number = scan.nextInt();

        if(isPaliendrome(number))
        System.out.println(number+" is paliendrome.");
        else
        System.out.println(number+" is not a paliendrome.");
    }    
}
