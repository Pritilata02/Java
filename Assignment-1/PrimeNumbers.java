public class PrimeNumbers{
  public static void main(String[] args){
      int count = 0;
      System.out.println("First 10 prime numbers between 100 and 200:");
      for (int i = 100; i <= 200; i++) 
      {
          if (isPrime(i)) 
          {
              System.out.print(i + " ");
              count++;
              if (count == 10)
                  break;
          }
      }
  }

  public static boolean isPrime(int n) {
      if (n<=1)
          return false;

      for (int i=2;i<=n/i;i++) 
      {
          if (n%i==0) 
          {
              return false;
          }
      }
      return true;
  }
}
