import java.util.Scanner;
public class BinarySearch {
static void binary_search(int arr[],int n,int key)
{
   int s=0,mid;
   	while (s<n)
   	{
	  mid=(s+n)/2;
	  if (arr[mid]==key)
	  {
         	System.out.println("element found at index:");
            System.out.println(mid);
         	break;
	  }
      else if (arr[mid]<key)
         s=mid+1;
      else
         n=mid-1;
    }
    if(s==n)
    {
    	System.out.println("element not found");
	}
 }

public static void main(String[] args)
{
    int arr[] = new int[50];
    int i,n,key;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements in the array: ");
    n=sc.nextInt();
    System.out.println("Enter Elements of the array: \n");
    for (i=0;i<n;i++)
    {
        arr[i]= sc.nextInt();
    }
        
	System.out.println("Enter Element to Search: ");
    key=sc.nextInt();
    binary_search(arr,n,key);
}
    
}
