package programsUsingRecursion;

public class IsPalindrome {

    public void isWordPalidrome(String word) {
        String revWord = getReverseWord(word);
        if( revWord.equals(word))
            System.out.println(word + " is palindrome ");
        else
            System.out.println(word + " is not a palindrome");

    }
    private String getReverseWord(String word){
        if(word==null || word.isEmpty())
            return word;
        else
            return word.charAt(word.length()-1)+ getReverseWord(word.substring(0,word.length()-1));

    }

    public static void main(String[] args){
        IsPalindrome obj = new IsPalindrome();
        obj.isWordPalidrome("madamaa");
    }
}
