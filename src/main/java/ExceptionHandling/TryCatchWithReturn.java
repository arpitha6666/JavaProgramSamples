package ExceptionHandling;

public class TryCatchWithReturn {
    public int someMethod(int i) {
        try {
            //some statement
            System.out.println("try");
            return 1;
        } catch (Exception e) {
            //some statement
            System.out.println("catch");
            return 999;
        } finally {
            System.out.println("Finally executed");
            System.exit(1);
            System.out.println("Finally executed2");
        }
    }


public  static void main(String[] args) {
    TryCatchWithReturn obj = new TryCatchWithReturn();
    obj.someMethod(10);
}
}
