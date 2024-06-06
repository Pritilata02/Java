import java.util.Scanner;

public class SparseMatrix_39 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int r,c,i,j,k=0;
        System.out.print("Enter the number of rows of the matrix: ");
        r=sc.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        c=sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for(i=0;i<r;i++) 
        {
            for(j=0;j<c;j++) 
            {
                System.out.print("element[" + i + "][" + j + "]: ");
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==0) 
                {
                    k++;
                }
            }
        }
        System.out.println("The matrix is:");
        for (i=0; i<r; i++) 
          {
              for (j=0; j<c; j++) 
              {
                  System.out.println(arr[i][j]);
              }
          }
        if(k>((r*c)/2))
        {
            System.out.println("Sparse matrix");
        } 
        else
         {
            System.out.println("Not a sparse matrix.");
        }
    }
}
