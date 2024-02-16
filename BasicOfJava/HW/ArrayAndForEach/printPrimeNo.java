import java.util.*;
public class printPrimeNo {
    public static void main(String arr[])
    {
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 integer no: ");

        for(int i=0; i<5; i++)
        {
            array[i] = sc.nextInt();
        }
        int primeCount=0;
        for(int num : array)
        {
            boolean isPrime = true;
            if(num<=1)
            {
                isPrime = false;
            }
            else
            {
                for(int i=2; i<=Math.sqrt(num); i++)
                {
                    if(num%i==0)
                    {
                        isPrime=false;
                        break;
                    }
                }
            }
            if(isPrime)
            {
                System.out.print(num+" ");
                primeCount++;
            }
        }
        System.out.println("\nTotal prime numbers in the array: " + primeCount);
    }
}

