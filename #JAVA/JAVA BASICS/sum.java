import java.util.*;
public class sum {
    public static void main(String args[]){
        System.out.println("Enter First Number");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        // Scanner sc2=new Scanner(System.in);
        int b=sc.nextInt();
        int c=a+b;
        System.out.print("the sum is: ");
        System.out.println(c);
        sc.close();
    }
    
}
