import java.util.Scanner;
public class MaxMin 
{
    public static void main(String[] args) 
    {
        int[] arr=new int[100];
        int n,max=arr[0],min=arr[0];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  size of the array: ");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++) 
        {
            if(arr[i]>max) 
            {
              max=arr[i];
            }
            if (arr[i]<min) 
            {
              min=arr[i];
            }
        }
        System.out.println("Maximum element:"+max);
        System.out.println("Minimum element:"+min);
    }
}
