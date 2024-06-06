public class FibonacciSeries{
  public static void main(String[] args){
      int i,n=15;
      int[] fibonacciSeries=new int[n];
      fibonacciSeries[0]=0; 
      fibonacciSeries[1]=1;
      for(i=2;i<n;i++)
      {
          fibonacciSeries[i]= fibonacciSeries[i-1]+fibonacciSeries[i-2];
      }
      System.out.println("First 15 numbers in the Fibonacci series:");
      for(i=0;i<n;i++)
      {
          System.out.print(fibonacciSeries[i]+" ");
      }
  }
}