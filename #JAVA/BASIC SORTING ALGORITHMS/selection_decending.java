public class selection_decending {
    public static void print(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
        System.out.println("\n");
    }
    public static void sort(int A[])
    {
        int n=A.length;
        for(int i=0;i<n-1;i++)
        {
            int maxPosition=i;
            for(int j=i+1;j<n;j++)
            {
                if(A[maxPosition]<A[j])
                {
                    maxPosition=j;
                }
            }
            int temp=A[maxPosition];
            A[maxPosition]=A[i];
            A[i]=temp;
        }
    }
    public static void main(String args[])
    {
        int A[]={5,7,3,4,1,9};
        sort(A);
        print(A);
    }
}
