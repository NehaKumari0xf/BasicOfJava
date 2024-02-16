import java.util.*;
public class printEvenNo {
    //print total even no in array
    public static void main(String ar[])
    {
        int []array = new int[5];        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any 5 integer no:- ");
        for ( int i=0; i<5; i++) 
        {
            array[i]=sc.nextInt();
        }
        int evenNum=0;

        System.out.println("even number are: ");
        for(int i=0;i<5;i++)
        {
            if(array[i]%2==0)
            {
            System.out.println(array[i]+" ");
            evenNum++;
            }
        }System.out.println("Total even number: "+evenNum);
    }
}
