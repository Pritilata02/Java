import java.util.Scanner;
public class MatrixLowerTriangula_33
 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n,i,j,k;
        System.out.println("Enter the size of the square matrix:");
        n = sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                System.out.print("elements[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
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
          k=1;
          for(i=0;i<n;i++)
          {
              for(j=0;j<n;j++)
              {
                  if(j>i && arr[i][j]!=0)
                  {
                      k=0;
                  }
              }
          }
          if(k==1)
          {
              System.out.println("The matrix is Upper triangular matrix");
          }
          else
          {
              System.out.println("The matrix is not Upper triangular matrix");
          }
    }  
       
}  

