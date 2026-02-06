public class reverseArray {

    public static void reverse(int A[])
    {
        int low=0;
        int high=(A.length-1);
        while(low<high)
        {
            int temp=A[high];
            A[high]=A[low];
            A[low]=temp;
            low++;
            high--;
        }
        
    }
    public static void main(String args[])
    {
        int A[]={6,7,52,4,3,1,8,3};
        reverse(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
