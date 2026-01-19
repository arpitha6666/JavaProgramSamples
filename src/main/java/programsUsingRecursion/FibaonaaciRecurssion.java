package programsUsingRecursion;

public class FibaonaaciRecurssion {
    public void printFib(int val1, int val2, int num) {
        if (num == 0)
            return;
        System.out.println(val1 + val2 + "");
        printFib(val2, val1 + val2, --num);

    }

    public static void main(String[] args) {
        FibaonaaciRecurssion obj = new FibaonaaciRecurssion();
        System.out.println("0 1");
        obj.printFib(0, 1, 10);

    }
}
