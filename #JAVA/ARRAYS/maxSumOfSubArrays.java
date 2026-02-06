public class maxSumOfSubArrays {
        public static void print(int A[])
        {
            int maxSum=Integer.MIN_VALUE;
            int currSum=0;
            for(int i=0;i<A.length;i++)
            {
                for(int j=i;j<A.length;j++)
                {
                    currSum=0;
                    for(int k=i;k<=j;k++)
                    {
                        currSum+=A[k];
                    }
                    System.out.print("current sum= "+currSum+" "+"\n");
                   if(currSum>maxSum)
                   {
                    maxSum=currSum;
                   }
                }
                System.out.print("\n");
            }
            System.out.println("max_sum="+maxSum);
        }
        public static void main(String args[])
        {
            int A[]={1,-2,6,-1,3};
            print(A);
        } 
}
