public class kadansAlgo {
    public static void main(String args[])

    {
        int A[]={-2,-3,4,-1,-2,1,5,-3};
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            
            cs+=A[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Max Sum is: "+ms);
    }
}
