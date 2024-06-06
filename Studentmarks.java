import java.util.Scanner;
class Studentmarks
{
    int marks;
    String name;
}

class Main
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of student:");
            int n=sc.nextInt();
            System.out.println("------------------------------------");
            Studentmarks std[] = new Studentmarks[n];
            for(int i=0;i<n;i++)
            {
                std[i] = new Studentmarks();
                System.out.println("Enter Student " + (i+1) +" data");
                System.out.println("Enter Student name : ");
                std[i].name = sc.next();
                System.out.println("Enter Student marks : ");
                std[i].marks = sc.nextInt();
            }
            Studentmarks temp;
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-1-i;j++)
                {
                    if(std[j].marks<std[j+1].marks)
                    {
                        temp=std[j];
                        std[j]=std[j+1];
                        std[j+1]=temp;
                    }
                }
            }
            System.out.println("Roll no    Name    marks ");
            int m=1;
            for(int i = 0; i < n;i++ )
            {
                System.out.println("  " +m +"      "+std[i].name+"            "+std[i].marks);
                m++;
            }
        }
    }
}