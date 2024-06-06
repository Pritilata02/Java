import java.util.Scanner;
public class MatrixSub_24 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        int[][] arr1=new int[n][n];
        int[][] arr2=new int[n][n];

        System.out.println("Enter the elements of the first matrix:");
        for (int i=0;i<n;i++) 
        {
            for (int j=0;j<n;j++) 
            {
                System.out.print("element[" + i + "][" + j + "]: ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for(int i=0;i<n;i++) 
        {
            for (int j=0;j<n;j++) 
            {
                System.out.print("element[" + i + "][" + j + "]: ");
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nThe First matrix is:");
        for (int i=0;i<n; i++) 
        {
            for (int j=0;j<n;j++) 
            {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println("\nThe Second matrix is:");
        for (int i=0;i<n; i++) 
        {
            for (int j=0;j<n;j++) 
            {
                System.out.print(arr1[i][j]+" ");
            }
        }
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++) 
            {
                arr2[i][j]=arr[i][j]-arr1[i][j];
            }
        }
        System.out.println("\nThe substraction of two matrices is:");
        for (int i=0;i<n; i++) 
        {
            for (int j=0;j<n;j++) 
            {
                System.out.print(arr2[i][j]+" ");
            }
        }
    }
}

