import java.util.Scanner;

public class InterchangeDiagonalMatrix_31 
{
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      int r,c,i,j,a,b;
      System.out.print("Enter the rows and columns of the matrix: ");
      r=scanner.nextInt();
      c=scanner.nextInt();
      int[][] arr=new int[r][c];
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
        if(r<c)
        {
            b=r;
        }
        else
        {
            b=c;
        }
        for(i=0;i<b;i++)
        {
            j=i;
            a=arr[i][j];
            arr[i][j]=arr[i][(b-j)-1];
            arr[i][(b-j)-1]=a;
        }
        System.out.println("the matrix after interchanging :");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}