public class printNos {

    public static void printnos(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
            System.out.println(n);
            printnos(n-1);
            
        
    }
    public static void main(String[] args) {
        int n=10;
        printnos(n);    
    }
}
