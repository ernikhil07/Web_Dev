public class AssignmentQ3 {

    public static int price(int A[])
    {
        int maxProfit=0;
        int buyingPrice=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(buyingPrice<A[i])
            {
                int profit=A[i]-buyingPrice;
                maxProfit=Math.max(profit, maxProfit);
            }
            else{
                buyingPrice=A[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[])
    {
        int A[]={7,6,4,3,1};
        int x=price(A);
        System.out.print(x);
    }
}
