public class maxSumOfSubArraysUsingPrifix {
        public static void print(int A[])
        {
            int maxNO=Integer.MIN_VALUE;
            int currSum=0;
            int prefix[]=new int[A.length];

            prefix[0]=A[0];
            for(int i=1;i<prefix.length;i++)
            {
                prefix[i]=prefix[i-1]+A[i];
            }
            for(int i=0;i<A.length;i++)
            {
                int start=i;
                for(int j=i;j<A.length;j++)
                {
                    int end=j;
                    
                    currSum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                    if(maxNO<currSum)
                    {
                        maxNO=currSum;
                    }
                }
                System.out.print("\n");
            }
            System.out.println(maxNO);
        }
        public static void main(String args[])
        {
            int A[]={2,4,6,8,10};
            print(A);
        }
}
    

