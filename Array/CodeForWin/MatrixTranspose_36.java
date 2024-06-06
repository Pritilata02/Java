import java.util.Scanner;
public class MatrixTranspose_36 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int r,c,i,j;
        System.out.print("Enter the rows and columns of the matrix: ");
        r=scanner.nextInt();
        c=scanner.nextInt();
        int[][] arr=new int[r][c];
        int[][] arr1=new int[c][r];
        System.out.println("Enter the elements of the matrix:");
        for(i=0;i<r;i++) 
        {
            for(j=0;j<c;j++) 
            {
                System.out.print("element[" + i + "][" + j + "]: ");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(i= 0;i<r;i++) 
              {
                  for(j=0;j<c;j++) 
                  {
                      System.out.println(arr[i][j] + " ");
                  }
               }
        for (i=0;i<r;i++)
         {
            for(j=0;j<c;j++) 
            {
                arr1[j][i]=arr[i][j];
            }
        }
        System.out.println("The transpose of the matrix is:");
        for(i= 0;i<r;i++) 
        {
            for(j=0;j<c;j++) 
            {
                System.out.println(arr1[i][j] + " ");
            }
         }
    }
}
