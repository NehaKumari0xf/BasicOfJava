
import java.util.*;
public class printOddno {
    //print total odd no in array
    public static void main(String ar[])
    {
        int []array = new int[5];        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any 5 integer no:- ");
        for ( int i=0; i<5; i++) 
        {
            array[i]=sc.nextInt();
        }
        int oddNum=0;

        System.out.println("odd number are: ");
        for(int i=0;i<5;i++)
        {
            if(array[i]%2!=0)
            System.out.println(array[i]+" ");
            oddNum++;
        }System.out.println("Total odd number: "+oddNum);


    }
}
