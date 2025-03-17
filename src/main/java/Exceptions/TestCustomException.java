package Exceptions;

public class TestCustomException {
    public static void validate(int age) throws CustomCheckedException {
        if(age<18){
            throw new CustomCheckedException("Age must be 18 or above");
        }
    }

    public static void divide(int a, int b) {
        if (b == 0) {
            throw new CustomRuntimeException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args){
        try {
            validate(2);
        }catch(CustomCheckedException e){
            System.out.println("Exception: "+e.getMessage());
        }

        try {
            divide(2,0);
        }catch(CustomRuntimeException e){
            System.out.println("Exception: "+e.getMessage());
        }

    }
}
