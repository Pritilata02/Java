import java.util.Scanner;
public class SumOfElementsInArray 
{
    public static void main(String[] args) 
    {
        int[] arr=new int[100];
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        System.out.print("Enter the elements in the array: ");
        for (int i=0;i<n;i++) 
        {
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++) 
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of all elements of the array : " + sum);
    }
}
