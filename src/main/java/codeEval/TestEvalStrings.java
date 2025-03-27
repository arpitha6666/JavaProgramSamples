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

    }
}
