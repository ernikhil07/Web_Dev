public class maxNo {

    public static int find_max(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                temp=max;
                max=arr[i];
                arr[i]=temp;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={6,7,3,1,5,8,4,2,9,3,4,8,5,2,17,4,6,3,12,1};
        int x=find_max(arr);
        System.out.print("Maximum no is: "+x);
    }
}
