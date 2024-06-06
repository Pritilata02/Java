public class ProfitLoss {
    public static void main(String[] args) {
    int a=200,b=300;
	if(b>a)
	{
		System.out.println("Profit:");
        System.out.println(b-a);
	}
	else if(b<a)
	{
		System.out.println("Loss:");
        System.out.println(a-b);
	}
	else
	{
		System.out.println("No Profit and Loss");
	}
        
    }
    
}
