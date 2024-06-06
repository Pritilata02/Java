import java.util.Scanner;
public class LeftRotate_21 
{
    public static void main(String [] args)
    {
      int[] arr=new int[100];
      int[] arr1=new int[100];
      int n,i,j,rotate;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      n=sc.nextInt();
      System.out.println("Enter elements of the array: ");
      for (i=0;i<n;i++) 
      {
        arr[i]=sc.nextInt();
      }
        System.out.println("The array will rotate how many time?  ");
        rotate=sc.nextInt();
        System.out.println("The Given array is:");
        for (i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        for(i=0;i<rotate;i++)
        {
            arr1[i]=arr[i];
        }
        for(i=rotate;i<n;i++)
        {
            arr[i-rotate]=arr[i];
        }
        for(i=n-rotate;i<n;i++)
        {
            arr[i]=arr1[i-(n-rotate)];
        }
        System.out.println("After left rotate the array is:");
        for (i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}