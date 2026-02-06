public class binarySearch {

    public static int binSearch(int A[],int n)
    {
        int low,mid,high;
        low=0;
        high=(A.length-1);
        while(low<=high)
        {
            mid=(high+low)/2;
            if(A[mid]==n){
                return mid;
            }
            if(A[mid]<n)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            } 
        }
        return -1;
    }
    public static void main(String args[])
    {
        int A[]={3,6,8,12,24,34,47,52,61,79,84,100};
        int key=52;
        int x=binSearch(A,key);
        if(x==-1)
        {
            System.out.print(key+"is not present in array");
        }
        else{
            System.out.print(key+" is present at "+x+" index position");
        }
    }
}
