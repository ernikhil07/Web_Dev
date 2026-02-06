public class oddOrEven {
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println("odd no");
        }
    }
    public static void main(String args[])
    {
        oddoreven(6);
        oddoreven(9);
        oddoreven(5);
        oddoreven(2);

    }
}
