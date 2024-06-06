import java.util.Scanner;
class Student1{
    int marks;
    String name;
}
public class Student{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student:");
        System.out.println("-----------------------------------");
        int n=sc.nextInt();

        Student1 std[] = new Student1[n];
        for(int i=0;i<n;i++)
        {
            std[i] = new Student1();
            System.out.println("Enter Student data"+(i+1));
            System.out.println("Enter Student name");
            std[i].name = sc.next();
            System.out.println("Enter Student marks");
            std[i].marks = sc.nextInt();
        }
        bubble_sort(std,n);
        getdetails(std,n);

    }
}
static void getdetails(Student1 std[] , int n)
{
    System.out.println("All Student details according to their marks are");
    System.out.println("-------------------------");
    for(int i=0;i<n;i++){
    System.out.println("Student roll:"+ (i+1));
    System.out.println("Student name:"+ std[i].name);
    System.out.println("Student marks:"+ std[i].marks);
    }
}
static void bubble_sort(Student1 std[],int n)
{
	int i,j;
    Student1 temp;
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-1-i;j++)
		{
			if(std[j].marks>std[j+1].marks)
			{
				temp=std[j];
				std[j]=std[j+1];
				std[j+1]=temp;
			}
		}
	}
}
