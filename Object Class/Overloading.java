public class Overloading {
  public static void main(String[] args) {
    Sum s=new Sum();
    int a=s.add(3, 4);
    System.out.println(a);
    int b=s.add(3, 4,2);
    System.out.println(b);
    int c=s.add(12, 4);
    System.out.println(c);
  }
}
class Sum{
  int add(int a,int b){
    return a+b;
  }
  int add(int a,int b,int c){
    return a+b+c;
  }
  double add(double a,int b){
    return a+b;
  }
  int add(int a,float )
}