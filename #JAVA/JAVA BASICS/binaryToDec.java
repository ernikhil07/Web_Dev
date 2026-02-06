public class binaryToDec{
    public static void bintodec(int binNo){
        int pow=0;
        int decNo=0;

        while(binNo>0)
        {
            int lastDig= binNo%10;
            decNo=decNo+(lastDig*(int)Math.pow(2,pow));
            pow++;
            binNo=binNo/10;

        }
        System.out.println("decimal of given no is "+decNo);
    }

    public static void main(String args[])
    {
        bintodec(1111);
       
    }
}