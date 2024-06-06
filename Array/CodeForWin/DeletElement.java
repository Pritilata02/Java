import java.util.Scanner;
public class DeletElement 
{
    public static void main(String[] args) 
    {
        int[] arr=new int[100];
        int n,pos;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n= sc.nextInt();
        System.out.println("Enter the elements in array: ");
        for (int i=0;i<n;i++) 
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element position to delete: ");
        pos=sc.nextInt();
            for (int i=pos-1;i<n-1;i++) 
            {
              arr[i]=arr[i+1];
            }
            n--;
            System.out.println("Elements of array after delete are: ");
            for (int i=0;i<n;i++) 
            {
              System.out.print(arr[i]+" ");
            }
        }
}
