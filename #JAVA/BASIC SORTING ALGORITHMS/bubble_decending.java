public class bubble_decending {
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
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(A[j]<A[j+1])
                {
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int A[]={5,7,3,4,1,9};
        sort(A);
        
        print(A);
    }
}
