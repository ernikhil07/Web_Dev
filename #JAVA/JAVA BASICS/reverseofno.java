public class reverseofno {
    public static void main(String args[])
    {
        int n=123456;
        int x=0;
        int i=1;
        while(n>0)
        {
            
            x=x+(n%10)*i;
            n=n/10;
            i++;
        }
        System.out.println(x);
    }
}
