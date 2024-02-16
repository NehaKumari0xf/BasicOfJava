//print positive no in array
import java.util.*;
public class positiveNo {
    public static void main(String arr[])
    {
        int array[] = new int [5];
        int positive = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 integer no: ");

        for(int i=0; i<5; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Positive numbers are: ");

        for(int i=0; i<5; i++)
        {
            if(array[i]>0)
            {
                System.out.print(array[i] + " ");
                positive++;
            }
        }
        System.out.println("Total positive numbers: " + positive);

    }
}
