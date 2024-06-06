import java.util.Scanner;
public class StudentDemo{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name=sc.nextLine();
        int[] marks=new int[3];
        System.out.println("Enter the marks of the student obtained in three subjects:");
        for (int i=0;i<3;i++) 
        {
            System.out.print("Subject "+(i+1)+" marks: ");
            marks[i]=sc.nextInt();
        }
        Student student=new Student();
        student.assignInitialValues(name, marks);
        student.displayStudentDetails();
    }
}

class Student {
    String name;
    int[] marks=new int[3];
    void assignInitialValues(String name,int[] marks) 
    {
        this.name=name;
        for (int i=0;i<3;i++) 
        {
            this.marks[i]=marks[i];
        }
    }
    int totalAverage() 
    {
        int totalMarks=0;
        int i=0;
        while(i<marks.length) 
        {
            totalMarks+=marks[i];
            i++;
        }
        return totalMarks/3;
    }
    void displayStudentDetails() 
    {
        System.out.println("Student Name: "+name);
        System.out.println("Total Marks: "+totalAverage());
    }
}