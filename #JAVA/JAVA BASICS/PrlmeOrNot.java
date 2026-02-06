public class PrlmeOrNot {
    public static int Check(int n)
    {
        if(n==2)
        {
            return 1;
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[]){
        boolean isPrime=true;
        int x= Check(2);
        if(x==0)
        {
            isPrime=false;
        }
        System.out.println(isPrime);
    }
}
