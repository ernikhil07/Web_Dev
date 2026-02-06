public class calculateBinomialCoefficiant {
    public static int Combination(int n,int r)
    {
        int a=Factorial(n);
        int b=Factorial(r);
        int s=Factorial((n-r));
        int Comb= a/(b*s);
        return Comb;
    }
    public static int Factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String args[]){
        int x=Combination(5,2);
        System.out.println(x);
    }
}
