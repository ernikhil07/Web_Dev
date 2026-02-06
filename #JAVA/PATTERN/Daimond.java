public class Daimond {

    public static void print_pattern(int n)
    {
        int x=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=(i+x);j++)
            {
                System.out.print("*"+" ");
            }
            x++;
            System.out.print("\n");
        }
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=(i+x-1);j++)
            {
                System.out.print("*"+" ");
            }
            x--;
            System.out.print("\n");
        }
    }
    public static void main(String args[])
    {
        print_pattern(6);
    }
}
