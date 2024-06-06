public class Palindrome{
    public static void main(String[] args){
    int n=121,rev,c;
	c=n;
	rev=0;
	while(n>0)
	{
	rev=(rev*10)+(n%10);
        n/=10;	
	}
	if(rev==c)
	{
		System.out.println("It is a Palindrome Number");
	}
	else
	{
		System.out.println("It is not a Palindrome Number");
	}	
    }
}