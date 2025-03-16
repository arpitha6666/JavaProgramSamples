package strings;

public class ReverseStringUsingConcat {

    public static void main(String[] args) {

        String str = "Hello";
        String out = "";
        for (int i = str.length()-1; i >=0 ;i--){
            out = out+str.charAt(i);

        }
        System.out.println(out);
    }
}
