public class Split 
{  
    public static void main(String args[])
    {  
    String s1="My name is Pritilata Samanta";  
    String[] words=s1.split("\\s");
    for(String w:words)
    {  
    System.out.println(w);  
    }  
    }
}  

