import java.util.Scanner;

public class primeOrNot {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
       
            System.out.println("Enter a Number: ");
            int n=sc.nextInt();
            boolean isPrime=true;
          for(int i=2;i<n;i++)
            { 
                if(n%i==0)
                {
                    isPrime=false;
                }
            }
        if(isPrime=true)
        {
            System.out.println(isPrime);
        }
        else{
            System.out.println(isPrime);
        }
        sc.close();
    }
        
}

