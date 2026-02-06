import java.util.*;
class maxSubArrSum
{
    public static void main(String args[])
    {
        int maxSubArr=Integer.MIN_VALUE;
        int minSubArr=Integer.MAX_VALUE;
        int arr[]={1,-2,6,-1,3};
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                    if(sum<minSubArr)
                    {
                        minSubArr=sum;
                    }
                    if(sum>maxSubArr)
                    {
                        maxSubArr=sum;
                    }
                }
                System.out.println(" ="+sum);
                System.out.println("\n");
            }
            
        }
        System.out.println("Maximum Sum is :"+maxSubArr);
        System.out.println("Minimum Sum is :"+minSubArr);

    }
}