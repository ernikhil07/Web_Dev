public class hollowrect {
    public static void hollowRect(int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==1||i==r||j==1||j==c)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        hollowRect(5,5);
    }
}
