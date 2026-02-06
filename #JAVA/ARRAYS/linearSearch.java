public class linearSearch {

    public static int find(int n,int arr[],int element)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==element)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={9,63,7,2,1,8,3,4,6};
        int n=arr.length;
        int element=6;
        int x=find(n,arr,element);
        System.out.println(element + "present at"+x+"th index position");
    }
}
