import java.util.Scanner;

public class DeleteDuplicate
{
    public static void main(String[] args) 
    {
        int[] arr=new int[100];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n= sc.nextInt();
        System.out.println("Enter the elements in array: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) 
        {
            for(int j=i+1;j<n;j++) 
            {
                if(arr[i]==arr[j]) 
                {
                    for(int k=j;k<n-1;k++) 
                    {
                        arr[k]=arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.println("Array elements after deleting duplicates: ");
        for (int i=0;i<n;i++) 
        {
            System.out.print(arr[i]+" ");
        }
    }
}
