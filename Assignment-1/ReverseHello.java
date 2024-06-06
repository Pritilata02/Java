
public class ReverseHello 
{
    public static void main(String[] args) 
    {
        char[] arr = {'H','E','L','L','O'};
        int i;
        System.out.println("Array in reverse order: ");
        for(i=arr.length-1;i>=0;i--) 
        {
          System.out.print(arr[i]+" ");
        }
    }
}
