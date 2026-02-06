public class print_Pairs {

    public static void pair(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                System.out.print(A[i]+","+A[j]+"|");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int A[]={2,4,6,8,10};
        pair(A);
    }
}
