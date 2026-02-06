import java.util.Scanner;
public class maxnoOfArray {
public static int findmax(int maxtrix[][],int n,int m)
{
    int maxno=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            maxno=Math.max(maxtrix[i][j],maxno);
        }
    }
    return maxno;
}
    public static void main(String args[])
    {
        int max=0;
        int maxtrix[][]=new int[3][3];
        int n=maxtrix.length;
        int m=maxtrix[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               maxtrix[i][j]=sc.nextInt(); 
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(maxtrix[i][j]+" "); 
            }
            System.out.println();
            max=findmax(maxtrix,n,m);
        }
        System.out.println("maximum no of matrix is: "+ max);
        sc.close();
    }
}
