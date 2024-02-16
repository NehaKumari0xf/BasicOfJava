import java.util.*;
//print negative no in array
public class negativeNo {
        public static void main(String arr[])
        {
            int array[] = new int [5];
            int negative = 0;
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any 5 integer no: ");
    
            for(int i=0; i<5; i++)
            {
                array[i] = sc.nextInt();
            }
            System.out.println("Negative numbers are: ");
            for(int i=0; i<5; i++)
            {
                if(array[i]>0)
                {
                    System.out.print(array[i] + " ");
                    negative++;
                }
            }
            System.out.println("Total negative numbers: " + negative);   
        }
    }
       
}
