public class print_subarrays {

    public static void print(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(A[k]+" ");
                }
                System.out.println();
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[])
    {
        int A[]={2,4,6,8,10};
        print(A);
    }
}
