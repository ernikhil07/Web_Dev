import java.util.*;
public class insertionSort {

    public static void print(Integer A[])
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
        System.out.println("\n");
    }

    public static void insertion(int A[])
    {
        for(int i=1;i<A.length;i++)
        {
            int curr=A[i];
            int prev=i-1;
            while(prev>=0&&A[prev]>curr)
            {
                A[prev+1]=A[prev];
                prev--;
            }
            A[prev+1]=curr;
        }
        
    }
    public static void main(String args[])
    {
        Integer A[]={5,7,3,4,1,9};
        // sort(A);
        Arrays.sort(A,Collections.reverseOrder());
        print(A);
    }
}
