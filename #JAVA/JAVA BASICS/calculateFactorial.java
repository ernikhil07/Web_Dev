import java.util.Scanner;

public class calculateFactorial {

    public static int factorial (int x){
        int f=1;
        for(int i=1;i<=x;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        int n;
        System.out.println("Enter number whose factorial you want?");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
        sc.close();
    }
}
