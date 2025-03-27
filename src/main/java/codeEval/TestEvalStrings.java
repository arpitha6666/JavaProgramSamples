package codeEval;

public class TestEvalStrings {
    public static void main(String[] args) {
        EvalStrings obj= new EvalStrings();
        System.out.println("1 - Given two strings, append them together (known as \"concatenation\") and " +
                "return the result - "+obj.concatinateStrings("fgh","fghj"));
        System.out.println("2 - Find out how many vowels present in the string- "+obj.countVowels("ARpitoUhaShhdetsb"));
        System.out.println("3 - Find out how many consonants present in the string- "+obj.countConsonants("ARpitoUhaShhdetsb"));
        System.out.println("4 - Given a string, return a new string where the " +
                "first and last chars have been exchanged.- "+obj.reverseFirstNLastCharInString("Ahana"));
        System.out.println("4 - Given a string, return a new string where the " +
                "first and last chars have been exchanged.- "+obj.reverseFirstNLastCharInString("ab"));
        System.out.println("4 - Given a string, return a new string where the " +
                "first and last chars have been exchanged.- "+obj.reverseFirstNLastCharInString("ARpitoUhaShhdetsb"));
        System.out.println("5 - Given a string of even length, return the first half. " +
                "So the string 'WooHoo' yields 'Woo' is "+obj.firstHalf("WooHoo"));
        System.out.println("6 - Given a string of even length, return the first half. " +
                "So the string 'WooHoo' yields 'Woo' is "+obj.firstHalf("ARpitoUhaShhdetsb"));
        System.out.println("7 - Return true if the given string contains 1 or 3 'e' chars. Otherwise return false - "+obj.stringE("ARpiteUhaEhhdetsb"));
        System.out.println("7 - Return true if the given string contains 1 or 3 'e' chars. Otherwise return false - "+obj.stringE("ehana"));
        System.out.println("7 - Return true if the given string contains 1 or 3 'e' chars. Otherwise return false - "+obj.stringE("Ahana"));
        System.out.println("7 - Given an \"out\" string length 4, such as \"<<>>\", " +
                "and a word, return a new string where the word is in the middle of the out string, e.g. \"<>\". - "+obj.outWord("<<>>","arst"));
        System.out.println("8 - Given an \"out\" string length 4, such as \"<<>>\", " +
                "and a word, return a new string where the word is in the middle of the out string, e.g. \"<>\". - "+obj.outWord("<<<>>","artist"));
        System.out.println("8 - Given a string and an int n, return a string made of the first and last ' n' chars from the string. " +
                "The string length will be at least n.- "+obj.nTwice("artist", 2));
        System.out.println("9 - Given tag and word strings, create the HTML string with tags around the word, e.g. 'Yay' - "+obj.makeTags("i", "Yay"));
        System.out.println("9 - Given tag and word strings, create the HTML string with tags around the word, e.g. 'Yay' - "+obj.makeTags("p", "Yay"));
        System.out.println("10 - Given a string, return a new string made of every other char starting with the " +
                "first, so \"Hello\" yields \"Hlo\" - "+obj.stringBits("HelloHello1"));

        System.out.println("11 - Count the number of \"xx\" in the given string. " +
                "We'll say that overlapping is allowed, so \"xxx\" contains 2 \"xx\" "+obj.countXX("XXatufhjnAX"));


    }
}
