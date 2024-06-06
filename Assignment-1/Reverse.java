import java.util.Scanner;
public class Reverse 
{
    public static void main(String[] args) 
    {
        int[] arr=new int[15];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in array: ");
        for(i=0;i<arr.length-1;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array in reverse order: ");
        for(i=arr.length-2;i>=0;i--) 
        {
          System.out.print(arr[i]+" ");
        }
    }
}
 