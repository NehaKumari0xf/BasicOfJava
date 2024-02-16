import java.util.Scanner;

public class nonPrimeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integer numbers:");

        // Input 5 numbers from the user
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Non-Prime numbers in the array:");

        int primeCount = 0;

        // Check for non-prime numbers and print them
        for (int num : numbers) 
        {
            boolean isPrime = true;
            if (num <= 1) 
            {
                isPrime = false;
            } else 
            {
                for (int i = 2; i <= Math.sqrt(num); i++)
                 {
                    if (num % i == 0) 
                    {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (!isPrime) 
            {
                System.out.print(num + " ");
                primeCount++;
            }
        }

        System.out.println("\nTotal non- prime numbers in the array: " + primeCount);
    }
}
