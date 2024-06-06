import java.util.Scanner;

public class IdentityMatrixCheck_38 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int r,c,i,j,k=1;
        System.out.print("Enter the number of rows of the matrix: ");
        r=scanner.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        c=scanner.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for(i=0;i<r;i++) 
        {
            for(j=0;j<c;j++) 
            {
                System.out.print("elements[" + i + "][" + j + "]: ");
                arr[i][j]=scanner.nextInt();
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
        for(i=0;i<r;i++) 
        {
            for(j=0;j<c;j++) 
            {
                if(i==j && arr[i][j]!=1 || (i!=j && arr[i][j]!=0))
                 {
                    k=0;
                    break;
                }
            }
        }

        if (k==1) 
        {
            System.out.println("It's an identity matrix");
        } 
        else 
        {
            System.out.println("It is not an identity matrix");
        }
    }
}
