package HW;
import java.util.*;

public class evenOrNot {
        public static void main(String []arr)
        {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter any integer no to check  even or odd: ");
            int number = scan.nextInt();

            if( isEven(number))
           // if(number %2==0)
            System.out.println(number+" is even no.");
            else
            System.out.println(number+" is odd no");

        }
        private static boolean isEven(int number)//dont remove boolean if u do then isEven() not works
        {
            return number %2==0;
        }
}
