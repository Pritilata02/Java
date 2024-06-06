import java.util.Scanner;
public class MatrixMul_25
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int[][] arr,arr2;
        int i,j,r,c,num;
        System.out.println("Enter the rows and columns of the first matrix:");
        r=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Enter the Scaler input:");
        num=sc.nextInt();
       
            arr=new int[r][c];
            arr2=new int[r][c];
            System.out.println("Enter the elements of the first matrix:");
            for(i=0;i<r;i++) 
            {
                for(j=0;j<c;j++) 
                {
                    System.out.print("elements [" + i + "][" + j + "]: ");
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("The First matrix is:");
              for(i= 0;i<r;i++) 
              {
                  for(j=0;j<c;j++) 
                  {
                      System.out.println(arr[i][j] + " ");
                  }
               }
            
            for(i=0;i<r;i++) 
            {
                for(j=0;j<c; j++) 
                {
                  arr2[i][j]=num*arr[i][j];
                }
                    
            }
            System.out.println("The Multipication of the matrix is:");
              for(i= 0;i<r;i++) 
              {
                  for(j=0;j<c;j++) 
                  {
                      System.out.println(arr2[i][j] + " ");
                  }
               }
     }
           
}    
  