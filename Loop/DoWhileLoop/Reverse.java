package DoWhileLoop;

public class Reverse {
    public static void main(String[] args){
        int n=123,sum=0,d;
	do
	{
		d=n%10;
		sum=sum*10+d;
		n/=10;
	}
    while(n>0);
	System.out.println(sum);
    }
}
