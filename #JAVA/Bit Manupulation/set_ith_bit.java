public class set_ith_bit {
        public static void setbit(int n,int i)
        {
            int bitMask=1<<i;
            System.out.println((n|bitMask));
            
        }
        public static void main(String args[])
        {
            setbit(10,2);
        }
}
    

