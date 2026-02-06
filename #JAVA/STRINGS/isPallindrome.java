public class isPallindrome {

    public static boolean ispalindrome(String str)
    {
        
        for(int i=0;i<str.length()/2;i++)
        {
            int last=str.length()-i-1;
            if(str.charAt(i)!=str.charAt(last))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String str="madam";
        boolean x=ispalindrome(str);
        System.out.println(x);
    }
}
