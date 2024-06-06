public class AlphabetNumberSpecialChr {
    public static void main(String[] args) {
    char ch= 'a';
	if ( (ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
	{
		System.out.println("It is a Alphabet");
	}
	else if (ch>='0' && ch<='9')
	{
		System.out.println("It is a Digit");
	}
	else
	{
		System.out.println("It is a Special Character");
	}
        
    }
    
}
