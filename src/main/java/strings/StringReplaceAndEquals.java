package strings;

public class StringReplaceAndEquals {
    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = s1.replace("x", "y");
        System.out.println(s2);
        System.out.println(s1 == s2);
    }

}
