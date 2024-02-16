package Function;

import java.util.*;

public class printString
{
    public static int calculateSum(int num1, int num2)
    {
        int sum = num1+ num2;
        System.out.println("sum: "+sum);
        return 0;
    }
    public static int calculateMultiple(int num1, int num2)
    {
        int product = num1*num2;
        System.out.print("Multiple: "+ product);
        return product;
    }
    public static void main(String arr[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=scan.nextInt();
        System.out.print("Enter second number: ");
        int num2=scan.nextInt();

        calculateSum(num1,num2);//calling a funtion
        calculateMultiple(num1, num2);

    }
}