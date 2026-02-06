public class AssignmentQ1 {

    public static boolean isReapeting(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]==A[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int A[]={1,1,1,3,3,4,3,2,4,2};
        System.out.print(isReapeting(A));
    }
}
