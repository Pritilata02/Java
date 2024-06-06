public class Practise {
  public static void main(String[] args) {
    A objA = new A();
    objA.start();
    A objA2 = new A();
    objA2.start();
    B objB = new B();
    objB.start();
    C objC = new C();
    Thread t = new Thread(objC);
    t.start();
    
class A extends Thread {
  @Override
  public void run() {
      // Task 1
      for (int i = 0; i < 50; i++) {
          System.out.println(i + " - A");
      }
  }
}

class B extends Thread {
  @Override
  public void run() {
      // Task 2
      for (int i = 0; i < 50; i++) {
          System.out.println(i + "-B");
      }
  }
}

class C implements Runnable {

  @Override
  public void run() {
      for (int i = 0; i < 50; i++) {
          System.out.println(i + "-C");
      }
  }

}
}
}
