public class orintNosInc {

    public static void printnums(int n)
    {   if(n==1)
        {
            System.out.println(n);
            return;
        }
        printnums(n-1);
        System.out.println(n);
    }
    public static void main(String args[])
    {
        int n=10;
        printnums(n);
    }
}
