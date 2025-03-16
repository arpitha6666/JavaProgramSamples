package strings;

public class StringPoolAndNewString {

    public static void main(String[] args){
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str3);
        System.out.println(str1.equals(str2));
    }
}
