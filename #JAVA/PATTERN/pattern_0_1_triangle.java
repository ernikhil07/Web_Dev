public class pattern_0_1_triangle {

    public static void print_pattern(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        print_pattern( 5);
    }
}
