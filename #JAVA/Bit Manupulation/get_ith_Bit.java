public class get_ith_Bit {
    public static void findbit(int n,int i)
    {
        int bitMask=1;
        if((n & (bitMask<<i))==0)
        {
            System.out.println("0 is present at"+i+"th position");
        }
        else{
            System.out.println("1 is present at"+i+"th position");
        }
    }
    public static void main(String args[])
    {
        findbit(6,0);
        findbit(7,2);
        findbit(5,1);
        findbit(2,4);

    }
}
