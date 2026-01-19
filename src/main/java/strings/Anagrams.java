package strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "madam";
        String s2 ="damam";

        if(s1.length()==s2.length()){
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean flag = Arrays.equals(charArray1,charArray2);
            System.out.println("is Anagram "+flag);
        }
    }
}
