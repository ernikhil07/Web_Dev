
public class update_ith_bit {
        public static int clear(int n,int i)
            {
                int bitMask= ~(1<<i);
                return n & bitMask;
                
            }
            
        public static int updatebit(int n,int i,int newbit)
        {
            n=clear(n,i);
            int BitMask=newbit<<i;
            return n|BitMask;
        }            
            public static void main(String args[])
            {
                System.out.println(updatebit(10,2,1));
            }
}
     

