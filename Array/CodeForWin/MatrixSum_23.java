import java.util.Scanner;
public class MatrixSum_23 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n=sc.nextInt();
        int[][] arr=new int[3][2];
        int[][] arr1=new int[3][2];
        int[][] arr2=new int[3][2];

        System.out.println("Enter the elements of the first matrix:");
        for (int i=0;i<3;i++) 
        {
            for (int j=0;j<2;j++) 
            {
                System.out.print("element[" + i + "][" + j + "]: ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for(int i=0;i<3;i++) 
        {
            for (int j=0;j<2;j++) 
            {
                System.out.print("element[" + i + "][" + j + "]: ");
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nThe First matrix is:");
        for (int i=0;i<3; i++) 
        {
            for (int j=0;j<2;j++) 
            {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println("\nThe Second matrix is:");
        for (int i=0;i<3; i++) 
        {
            for (int j=0;j<2;j++) 
            {
                System.out.print(arr1[i][j]+" ");
            }
        }
        for(int i=0;i<3;i++) 
        {
            for(int j=0;j<2;j++) 
            {
                arr2[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("\nThe sum of two matrices is:");
        for (int i=0;i<3; i++) 
        {
            for (int j=0;j<2;j++) 
            {
                System.out.print(arr2[i][j]+" ");
            }
        }
    }
}
