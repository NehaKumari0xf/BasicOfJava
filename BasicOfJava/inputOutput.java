import java.util.*;

public class inputOutput {

    public static void main(String []arr)
    {
        //input
        Scanner scan = new Scanner(System.in);//Scanner is class and sc is object
        String name = scan.next();
        System.out.println(name);//output neha kumari:- it will giive you only neha bcz next function read only first one word
        
        Scanner scan1 = new Scanner(System.in);//Scanner is class and sc is object
        String name1 = scan1.nextLine();
        //nextInt() for integer type and nextFloat() for float type
        System.out.println(name1);//it will give you Neha kumari bcx this function reads all the words 

    }
}
