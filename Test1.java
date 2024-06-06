import java.util.Scanner;

public class Test1 {
    private static final Exception PritiException = null;

    public static void main(String[] args) throws CloneNotSupportedException, PritiException {
        int a[] = new int[50];
        A arr[] = new A[50];
        String s = "Debjani";

        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();

        try {
            System.out.println(s.charAt(x));
            // System.out.println(a[x]);
            System.out.println("Tset");
            System.out.println(100 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Doesn't exist");
        }

        // catch (ArithmeticException e) {
        // // System.out.println(e);
        // System.out.println("can't devide by zero");
        // }
        // catch(ArithmeticException e){

        // }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String length is less");
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println("Exception handled");
        } finally {
            System.out.println("This is finally block 1");
        }

        System.out.println("Ho");

        try {
            // System.out.println(s.charAt(x));
            System.out.println(a[x]);
            System.out.println("Tset");
            // System.out.println(100 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Doesn't exist");
        } catch (ArithmeticException e) {
            // System.out.println(e);
            System.out.println("can't devide by zero");
        }
        // catch(ArithmeticException e){

        // }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String length is less");
        } finally {
            System.out.println("This is finally block 2");
        }

        // new A().run();
        // System.out.println("Test Hi");

        // B objb = new B();
        // try {
        // B objB2 = (B) objb.clone();
        // } catch (CloneNotSupportedException e) {
        // System.out.println("Can't clone");
        // }

        // B objB3 = (B) objb.clone();

        int age = 15;
        try {
            if (age < 21) {
                throw new PritiException("This is the message");
            }
        } catch (PritiException e) {
            System.out.println(e.getMessage());
        }

    }
}

class A {
    boolean can_run = true;
    int run_speed = 10;

    void run() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println(100 / 0);
    }
}

class B implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //
        return super.clone();
    }
}

class PritiException extends Exception {

    String msg;

    PritiException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}