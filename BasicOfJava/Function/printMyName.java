package Function;
import java.util.Scanner;

public class printMyName {
   public static void printName(String name)
    {
        System.out.print("printName function called successfully "+name);
        return ;
    }
    public static void main(String arr[])
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter any string: ");
        String name=scan.nextLine();

        printName(name);//calling a funtion
    } 
}
