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

        System.out.println("12 - Given a non negative number n where (n>0), create and return a new string array of length n,\n" +
                "containing the strings \"0\", \"1\" \"2\" .. through n-1");
        String[] out = obj.fizzArray2(10);
        for(String i : out)
            System.out.print(i + " ");

        System.out.println("\n13 - Given a string, return true if it ends in 'ly' - "+ obj.endsLy("Agvhknklafly"));
        System.out.println("13 - Given a string, return true if it ends in 'ly'  - "+ obj.endsLy("gdhsfh"));

        System.out.println("14 - Given a string, return a string made of the chars at " +
                "indexes 0,1, 4,5, 8,9 ... so \"kittens\" yields \"kien\" - "+ obj.altPairs("kittens"));

        System.out.println("15 - Given a string of any length, return a new string where the last 2 chars, " +
                "if present, are swapped, so \"coding\" yields \"codign\" - "+ obj.lastTwo("kittens"));

        System.out.println("16 - Given a string, if the first or last chars are 'x', " +
                "return the string without those 'x' chars, and otherwise return the string unchanged.- "
                + obj.withoutX("xkittens") +"\n" +  obj.withoutX("xkitXxtens") +"\n" +  obj.withoutX("kitXxtensxX"));

        System.out.println("17 - Given 2 strings, return their concatenation, except omit the first char of each. " +
                "The strings will be at least length 2. "
                + obj.middleTwo("xkittens") +" " +  obj.middleTwo("kittens") +" " +  obj.middleTwo("tghj"));

        System.out.println("18 - Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with 'edited' - "
                + obj.frontAgain("edited") +" " +  obj.frontAgain("Edited") +" " +  obj.frontAgain("ghmbjnuj"));

        System.out.println("19 - Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with 'edited' - "
                + obj.frontAgain("edited") +" " +  obj.frontAgain("Edited") +" " +  obj.frontAgain("ghmbjnuj"));

        System.out.println("20 - Given a string, return a new string where the last 3 chars are now in upper case - "
                +obj.endUp("English"));

        System.out.println("21 - Given a string, return a version without both the first and last char of the string. The strings will be at least length 3 -"
                        +obj.withoutEnd2("Engl"));

        System.out.println("22 - Given a string and an index, return a string length 2 starting at the given index. \n" +
                "If the index is too big or too small to define a string length 2, use the first 2 chars." +
                " The string length will be at least 2. -"
                +obj.twoChar("Engl",0) + " "+ obj.twoChar("Engl",1));

        System.out.println("23 - Given a string, return a version without both the first and last char of the string. " +
                "The strings will be at least length 3 -"
                +obj.makeAbba("Engl", "ty"));

        System.out.println("24 - Given a string and a second \"word\" string, we'll say that the word matches the string if \n" +
                "it appears at the front of the string, except its first char does not need to match exactly. \n" +
                "On a match, return the front of the string, or otherwise return the original string. \n" +
                "So, with the string \"hippo\" the word \"hi\" returns \"hi\" and \"xip\" " +
                "returns \"hip\". The word will be at least length 1 - "+ obj.startWord("hippe","hi")+ " "+ obj.startWord("xip","hi"));

        System.out.println("25 - We'll say that an element in an array is \"notalone\" if there are values before and after it,\n " +
                "and those values are different from it. Return a version of the given array where every instance of the given value which is \n" +
                "notalone is replaced by whichever value to its left or right is larger - ");

        System.out.println("26 - Given a string, return a string length 1 from its front, unless front is false, \n" +
                "in which case return a string length 1 from its back. The string will be non-empty - "+obj.theEnd("Ars", false) + " "+ obj.theEnd("Ars", true));

        System.out.println("27 - Given a string, if the string 'del' appears starting at index 1, return a string where that\n" +
                " 'del'  has been deleted. Otherwise, return the string unchanged - "+obj.delDel("AdelArs"));

        System.out.println("28 - Given a string of odd length, return the string length 3 from its middle, " +
                "so 'Candy' yields 'and'. The string length will be at least 3 - "+obj.middleThree("returna"));

        System.out.println("29 - Given a string, return a string length 2 made of its first 2 chars. \n" +
                "If the string length is less than 2, use '@' for the missing chars - "+ obj.atFirst("")+ " "+ obj.atFirst("s")+ " "+ obj.atFirst("ae")+ " "+ obj.atFirst("ard"));

        System.out.println("30- Check if string has all unique characters(considering white spaces and case sensitivity). \n" +
                "Eg: i/p : reghav o/p : true i/p : raghav o/p : false - "+obj.isStringUnique("reghav")+ " "+ obj.isStringUnique("raghav"));

        System.out.println("31 - Perform basic string compression using counts of repeated characters. \n" +
                "(If the compressed string is larger than or equal to the orginal string(in length) then the original string should be returned) \n" +
                "Eg: i/p : aaaaccccbbbhhhjj o/p : a4c4b3h3j2 - "+obj.countsOfRepeatNum("aaaccccbbbhhjj")+ " "+ obj.countsOfRepeatNumUsingFor("aaatttffhhbj"));

        System.out.println("31 - Pass two Strings. Check whether the second String is rotated form of the first String - "+obj.isStringRotated("ars", "ars"));

        System.out.println("32 - Accept a string as input. The method should return a string which does not contain any repeating characters. - "+obj.noRepeat("arsarsars"));

        System.out.println("33 - Pass a string as parameter. Convert the string characters to lowercase if it is uppercase and to uppercase if its lowercase.\n"+
                "If there are digits or special chars in the string, they should be omitted - "+obj.convertCase("aRa1s@$rs"));

        System.out.println("34 - Pass a string as parameter. Convert the string characters to lowercase if it is uppercase and to uppercase if its lowercase.\n"+
                "If there are digits or special chars in the string, they should be omitted - "+obj.convertCase("aRa1s@$rs"));

        System.out.println("35 - Given a non-empty string and an int N, return the string made starting with char 0,\n"+
        "and then every N th char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more- "+obj.everyNth("wertyuiofghjkbhjk",2));

        System.out.println("36 - We'll say that a number is \"teen\" if it is in the range 13..19 inclusive.\n" +
                "Given 3 int values, return true if 1 or more of them are teen."+obj.hasTeen(12,13,14));

        System.out.println("37 - Pass a string as parameter and return a boolean to indicate whether the string passed is a boolean or not - "+obj.isBoolean("true")+ " "+obj.isBoolean("false")+ " "+obj.isBoolean("true1"));

        System.out.println("38 - Accept a string as parameter. Find out how many digits are present in the string - "+obj.countNumOfDigits("a1et4bin5m"));

        System.out.println("39 - Pass a string as parameter. Reverse the string and return it. \n" +
                "All the alphabets in the strings should be individually reversed and then returned - "+obj.reverseString("a1et4bin5m"));
        System.out.println("41 - Pass a string as parameter.Return a new string which contains the passed strings \n" +
                "Characters in a sorted manner(Ascending)- "+obj.sortString("artyujn"));
        System.out.println("42 - Pass two strings.Check one is the permutation of the other. Case sensitivity an\n" +
                "The frequency of each character in the first string should be same as the second String.\n" +
                "Then only you can say that the string1 is a permutation of the other - "+ obj.isStringPermute("uttara","rutata")+ " "+obj.isStringPermute("java","ja va"));
        System.out.println("43 - Given a string, take the last char and return a new string with the last char added at the front and back - "+obj.backAround("cat"));


    }
}
