import java.util.Scanner;

public class Marks 
{
    int roll;
    String name;
    int marks;
    String sec;
    public void getDetails()
    {
        System.out.println("Student name is : "+name);
        System.out.println("Roll no : "+roll);
        System.out.println("Marks : "+marks);
        System.out.println("Section : "+sec);
        System.out.println("--------------------------------------------------------");
    }

    public static void main(String[] args) 
    {
    
        Marks student1 = new Marks();
        Marks student2 = new Marks();
        Marks student3 = new Marks();
        Marks student4 = new Marks();

        student1.name = "Arka Paul";
        student1.roll = 1;
        student1.marks = 99;
        student1.sec = "A";

        student2.name = "Rahul Bose";
        student2.roll = 2;
        student2.sec = "B";
        student2.marks = 94;

        student3.name = "Ashok bose";
        student3.roll = 3;
        student3.marks = 89;
        student3.sec = "C";

        student4.name = "Sudeshna Roy";
        student4.marks = 81;
        student4.roll = 4;
        student4.sec = "D";
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Number of Record:");
        // int n=sc.nextInt();
        // String a[]=new String[n];
        // System.out.println("Enter"+n+ "names:");
        // for(int i=0;i<n;i++)
        // {
        //     a[i] =sc.nextLine();
        // }
        // int b[]=new int[n];
        // System.out.println("Enter"+n+ "marks:");
        // for(int i=0;i<n;i++)
        // {
        //     b[i] =sc.nextInt();
        // }


        student1.getDetails();
        student2.getDetails();
        student3.getDetails();
        student4.getDetails();
    } 
}
    
