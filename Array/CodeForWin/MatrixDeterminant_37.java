import java.util.Scanner;

public class MatrixDeterminant_37 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,j,d=0,n;
        System.out.print("Enter the size of the square matrix: ");
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (i=0;i<n;i++) 
        {
            for (j=0;j<n;j++) 
            {
                System.out.print("elements[" + i + "][" + j + "]: ");
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (i=0; i<n; i++) 
        {
            for (j=0; j<n; j++) 
            {
                System.out.println(arr[i][j]);
            }
        }
        for (i=0;i<3;i++) 
        {
            d+= arr[0][i] * (arr[1][(i+1)% n]*arr[2][(i+2)%n]-arr[1][(i+2)%n]*arr[2][(i+1)%n]);
        }
        System.out.println("Determinant of the matrix is: " + d);
    }
}
