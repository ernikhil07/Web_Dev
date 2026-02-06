
public class clear_last_i_bits {
    public static int clearlastibits(int n,int i)
    {
        int bitMask=(~0)<<i;
        return n&bitMask;
    }
    public static void main(String args[])
    {
        System.out.println(clearlastibits(15,2 ));
    }
}
