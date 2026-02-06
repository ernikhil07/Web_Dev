public class isPalindrome {
    public static int ispalindrome(int n)
    {
        int Myno=n;
        int x;
        int y=0;
        while (n>0) {
            x=n%10;
            y=y*10+x;
            n=n/10;
        }
        if(y==Myno)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        boolean x;
        int y=ispalindrome(101);
        if(y==1)
        {
            x=true;
        }
        else{
            x=false;
        }
        System.out.println(x);
    }
}
