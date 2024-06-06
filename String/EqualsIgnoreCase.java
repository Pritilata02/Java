public record EqualsIgnoreCase() {
 
    public static void main(String args[])
    {  
    String s1="pritilata";  
    String s2="pritilata";  
    String s3="PRITILATA";  
    String s4="samanta";  
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.equalsIgnoreCase(s3));  
    System.out.println(s1.equalsIgnoreCase(s4));
    }
  }  


