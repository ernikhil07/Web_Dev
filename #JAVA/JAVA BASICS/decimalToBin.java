public class decimalToBin {
    public static void dectobinary(int decNo){
        int x;
        int pow=0;
        int z=0;
        do{
            x=decNo%2;
            z=z+(x*((int)Math.pow(10,pow)));
            pow++;
            decNo=decNo/2;
            
        }
        while(decNo>0);
        System.out.println(z);
        
    }
    public static void main(String args[])
    {
        dectobinary(6);
    }
}
