public class sum_of_n_numbers {

    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int x= n+(sum(n-1));
        return x;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
