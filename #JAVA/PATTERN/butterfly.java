public class butterfly {

    public static void print_pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            
            for(int j=(2*(n-i));j>0;j--)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        } 
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            
            for(int j=(2*(n-i));j>0;j--)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        } 
    }
    public static void main(String args[])
    {
        print_pattern(4);
    }
}
