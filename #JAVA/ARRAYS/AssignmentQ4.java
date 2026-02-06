public class AssignmentQ4 {

    public static void findtrapedwater(int A[])
    {
        int n=A.length;
        int leftMax[]=new int[n];
        leftMax[0]=A[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(A[i],leftMax[i-1]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(A[i],rightMax[i+1]);
        }
        int trappedWater=0;
        for(int i=0;i<n;i++)
        {
            int waterLevel=Math.min(rightMax[i],leftMax[i])-A[i];
            trappedWater+=waterLevel;
        }
            System.out.print(trappedWater);
    }
    public static void main(String args[])
    {
        int A[]={4,2,0,3,2,5};
        findtrapedwater(A);
    }
}
