import java.util.Scanner;
public class BubbleSort{
public static void main(String[] args)
{
	int i,n;
    int arr[] = new int[50];
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    n=sc.nextInt();
	System.out.println("Elements of the array are:");
	for(i=0;i<n;i++)
	{
        arr[i]= sc.nextInt();
	}
	bubble_sort(arr,n);
	System.out.println("Sorted array: ");
	for(i=0;i<n;i++)
	{
		System.out.println(arr[i] );
	}
}

static void bubble_sort(int arr[],int n)
{
	int i,j,temp;
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
}
