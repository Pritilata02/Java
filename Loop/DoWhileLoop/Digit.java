package DoWhileLoop;

public class Digit {
    public static void main(String[] args){
        int n=111,i;
	i=0;
	do
	{
		n/=10;
		i++;	
	}
    while (n!=0);
	System.out.println(i);
    }
}
