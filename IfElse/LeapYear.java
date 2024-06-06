public class LeapYear {
    public static void main(String[] args){
    int a=1900 ;
	if((a%100==0) && (a%400==0))
	{
		System.out.println(" Leap Year");
	}
	else if((a%100!=0) && (a%4==0))
	{
		System.out.println("Leap Year");
	}
	else
	{
		System.out.println("Not Leap Year");
	}
    }
    
}
