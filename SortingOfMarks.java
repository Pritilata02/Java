import java.util.Scanner;
public class SortingOfMarks {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Record:");
        int n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("Enter"+n+ "names:");
        for(int i=0;i<n;i++)
        {
            a[i] =sc.nextLine();
        }
        int b[]=new int[n];
        System.out.println("Enter"+n+ "marks:");
        for(int i=0;i<n;i++)
        {
            b[i] =sc.nextInt();
        }


    }
    static void show(int a[],int b[],int n)
{
    int i;
    System.out.println("\n\nRollno\tName\tMarks\n");
    for (i=0;i<n;i++)
    {
        System.out.println("%d\t\t%d\n",(i+1)+  (a[i])+ (b[i]));
    } 
}
    static void bubble_sort(int b[],int a)
{
    int i, j;
    int temp;
    for (i=0;i<a-1;i++)
    {
        for(j=0;j<(a-1-i);j++)
        {
            if(b[j]<b[j+1])
            {
                temp=b[j];
                b[j]=b[j + 1];
                b[j+1]=temp;
            } 
        }
    }
}
}
    
