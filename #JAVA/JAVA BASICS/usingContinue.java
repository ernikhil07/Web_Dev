import java.util.*;
public class usingContinue {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Enter a Number: ");
            int n=sc.nextInt();
            if(n%10==0)
            {
                System.out.println("number Skipped!!!");
                continue;
            }
            System.out.println(n);
            sc.close();
        }while(true);
    }
}
