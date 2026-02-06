public class isEven {
    public static int iseven(int n){
        if(n%2==0)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String args[]){
        boolean x=true;
        int n=11;
        int y=iseven(n);
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
