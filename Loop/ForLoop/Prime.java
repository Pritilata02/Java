package ForLoop;

public class Prime {
    public static void main(String[] args){
    int n=0,i,num=7;
	n=0;
	i=2;
	for(i=2;i<num;i++)
    {
        if(num%i==0)
        {
            n=1;
            break;
        }
    }
    if(n==0)
    {
        System.out.println(" Prime number");
    }
    else if(n==1)
    {
        System.out.println(" Not a Prime number");
    }
    }
    
}
