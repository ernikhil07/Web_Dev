public class AssignmentQ2 {

    public static int find(int A[],int n)
    {
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==n)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int A[]={4,5,6,7,0,1,2,};
        int x=find(A,3);
        System.out.print(x);
    }
}
