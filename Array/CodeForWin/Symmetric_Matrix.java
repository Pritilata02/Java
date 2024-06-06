import java.util.Scanner;

public class Symmetric_Matrix 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[100][100];
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int count=0;
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Element "+i+" "+j+":");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]!=arr[j][i])
                {
                    count=1;
                    break;
                }
            }
        }
        System.out.println("The matrix : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        if(count==0)
        {
            System.out.println("symmetric");
        }
        else
        {
            System.out.println("not symmetic");
        }

    }
}