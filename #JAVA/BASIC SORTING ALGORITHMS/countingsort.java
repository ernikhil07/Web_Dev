public class countingsort {
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
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            largest=Math.max(largest, A[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<A.length;i++)
        {
            count[A[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--)
        {
            while(count[i]>0)
            {
                A[j]=i;
                j++;
                count[i]--;
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
