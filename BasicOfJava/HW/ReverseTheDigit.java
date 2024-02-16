package HW;

import java.util.Scanner;

public class ReverseTheDigit {
    public static void main(String arr[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any 4 digit no to reverse the no: ");
        int number = scan.nextInt();

        if(number <1000 || number > 9999)
        {
            System.out.println("Pleasen enter a valid 4 digit int no");
        }
        else
        {
            int reversedNumber = reversedNumber(number);
            System.out.println("Reversed number: "+reversedNumber);
        }
    }

    public static int reversedNumber(int number)
    {
        int reversedNumber = 0;
        while(number !=0)
        {
        int digit = number % 10;
        reversedNumber=reversedNumber*10+digit;
        number/=10;
        }return reversedNumber;
    }
}
