public class maxSubArraySumUsingKadans {

    public static void printMaxSum(int A[])
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int Maxelement=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            cs+=A[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs, ms);
            Maxelement=Math.max(Maxelement,A[i]);
        }
        ms= ms==0? Maxelement:ms;
        System.out.print("Maximum sum of subarray is: "+ms);
    }
    public static void main(String args[])
    {
        int A[]={-4,-9,-16,-45,-8,-2,-47,-63};
        printMaxSum(A);
    }
}
