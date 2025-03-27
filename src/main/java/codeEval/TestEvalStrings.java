package codeEval;

public class TestEvalStrings {
    public static void main(String[] args) {
        EvalStrings obj= new EvalStrings();
        System.out.println("Given two strings, append them together (known as \"concatenation\") and " +
                "return the result - "+obj.concatinateStrings("fgh","fghj"));
        System.out.println("Find out how many vowels present in the string- "+obj.countVowels("ARpitoUhaShhdetsb"));
        System.out.println("Find out how many consonants present in the string- "+obj.countConsonants("ARpitoUhaShhdetsb"));
        System.out.println("Given a string, return a new string where the " +
                "first and last chars have been exchanged.- "+obj.reverseFirstNLastCharInString("Ahana"));
        System.out.println("Given a string, return a new string where the " +
                "first and last chars have been exchanged.- "+obj.reverseFirstNLastCharInString("ab"));
        System.out.println("Given a string, return a new string where the " +
                "first and last chars have been exchanged.- "+obj.reverseFirstNLastCharInString("ARpitoUhaShhdetsb"));
        System.out.println("Given a string of even length, return the first half. " +
                "So the string 'WooHoo' yields 'Woo' is "+obj.firstHalf("WooHoo"));
        System.out.println("Given a string of even length, return the first half. " +
                "So the string 'WooHoo' yields 'Woo' is "+obj.firstHalf("ARpitoUhaShhdetsb"));

        System.out.println("Return true if the given string contains 1 or 3 'e' chars. Otherwise return false - "+obj.stringE("ARpiteUhaEhhdetsb"));
        System.out.println("Return true if the given string contains 1 or 3 'e' chars. Otherwise return false - "+obj.stringE("ehana"));
        System.out.println("Return true if the given string contains 1 or 3 'e' chars. Otherwise return false - "+obj.stringE("Ahana"));

        System.out.println("Given an \"out\" string length 4, such as \"<<>>\", " +
                "and a word, return a new string where the word is in the middle of the out string, e.g. \"<>\". - "+obj.outWord("<<>>","arst"));
        System.out.println("Given an \"out\" string length 4, such as \"<<>>\", " +
                "and a word, return a new string where the word is in the middle of the out string, e.g. \"<>\". - "+obj.outWord("<<<>>","artist"));

        System.out.println("Given a string and an int n, return a string made of the first and last ' n' chars from the string. " +
                "The string length will be at least n.- "+obj.nTwice("artist", 2));


    }
}
