package codeEval;

public class EvalStrings {
    //Given two strings, append them together (known as "concatenation") and return the result.
    public String concatinateStrings(String a, String b) {
        return a + "" + b;
    }

    //Pass a string as parameter. Find out how many vowels present in it
    public int countVowels(String obj) {
        int count = 0;
        char[] arr = obj.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||
                    arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
                count++;
            }
        }
        return count;
    }

    //Accept a string as parameter. Find out how many consonants present in it.
    public int countConsonants(String obj) {
        int count = 0;
        char[] arr = obj.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char d = Character.toLowerCase(arr[i]);
            if (!(d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u')) {
                count++;
            }
        }
        return count;
    }
    //Given a string, return a new string where the first and last chars have been exchanged. frontBack("code") -> "eodc" ,
    // frontBack("a") -> "a" , frontBack("ab")-> "ba" , frontBack("PrograM")-> "MrograP" ,

    public String reverseFirstNLastCharInString(String obj) {
        String out = "";
        out = obj.charAt(obj.length() - 1) + obj.substring(1, obj.length() - 1) + obj.charAt(0);
        return out;
    }

    //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    //Return true if the given string contains 1 or 3 'e' chars. Otherwise return false.
    public boolean stringE(String str) {
        int count = 0;
        char[] c = str.toCharArray();
        for (char d : c) {
            if (d == 'e' || d == 'E') {
                count++;
            }
        }
        if (count == 1 || count == 3) {
            return true;
        } else return false;
    }

    //Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<>".
    // Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
    public String outWord(String out, String word) {
        String res = "";
        res = out.substring(0, out.length() - 2) + word + out.substring(out.length() - 2, out.length());
        return res;
    }

    //Given a string and an int n, return a string made of the first and last ' n' chars from the string. The string length will be at least n.
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    //The web is built with HTML strings like "Yay" which draws Yay as italic text.
    // In this example, the "i" tag makes and which surround the word "Yay".
    // Given tag and word strings, create the HTML string with tags around the word, e.g. "Yay".
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "<" + tag + ">";
    }

    //Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    public String stringBits(String str) {
        String res = "";
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i = i + 2) {
            res = res + c[i];
        }
        return res;
    }

    //Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx"
    public int countXX(String str) {
        int count = 0;
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            if ((c[i] == 'X' && c[i + 1] == 'X') || c[i] == 'x' && c[i + 1] == 'x') {
                count++;
            }
        }
        return count;
    }


    /*
    Given a non negative number n where (n>0), create and return a new string array of length n,
    containing the strings "0", "1" "2" .. through n-1. Note: String.valueOf(xxx) will make the String form of most types.
    The syntax to make a new string array is: new String[desired_length]
     */
    public String[] fizzArray2(int n) {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = Integer.toString(i);
        }
        return res;
    }

    //Given a string, return true if it ends in "ly".
    public boolean endsLy(String str) {
        if (str.endsWith("ly"))
            return true;
        else
            return false;
    }

    //Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
    public String altPairs(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i = i + 4) {
            if (i < str.length() - 1)
                res = res + str.charAt(i) + str.charAt(i + 1);
            else
                res = res + str.charAt(i);
        }
        return res;
    }

    //Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
    public String lastTwo(String str) {
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    //Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
    public String withoutX(String str) {
        String res = "";
        if (str.startsWith("x") || str.startsWith("X")) {
            res = str.substring(1, str.length());
        }
        if (str.endsWith("x") || str.endsWith("X")) {
            res = str.substring(0, str.length() - 1);
        }
        return res;
    }

    //Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
    // The string length will be at least 4.
    public String middleTwo(String str) {
        String out = "";
        out = out + str.substring(str.length() / 2, str.length());
        return out;
    }

    //Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
    public boolean frontAgain(String str) {
        String first = str.substring(0, 2);
        String second = str.substring(str.length() - 2, str.length());
        if (first.equalsIgnoreCase(second))
            return true;
        else
            return false;
    }

    //Given a string, return a new string where the last 3 chars are now in upper case.
    // If the string has less than 3 chars, uppercase whatever is there.
    // Note that str.toUpperCase() returns the uppercase version of a string.
    public String endUp(String str) {
        String res = str.substring(str.length() - 3).toUpperCase();
        return res;
    }

    //Given a string, return a version without both the first and last char of the string. The strings will be at least length 3.
    public String withoutEnd2(String str) {
        return str.substring(1, str.length() - 1);
    }

    //Given a string and an index, return a string length 2 starting at the given index.
    // If the index is too big or too small to define a string length 2, use the first 2 chars.
    // The string length will be at least 2.
    public String twoChar(String str, int index) {
        if (index + 2 > str.length())
            return str.substring(0, 2);
        else
            return str.substring(index, index + 2);
    }

    //Given two strings, a and b, return the result of putting them together in the order 'abba', e.g. "Hi" and "Bye" returns "HiByeByeHi".
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /*
    Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
    except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the original string.
    So, with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
     */
    public String startWord(String str, String word) {
        if (word.substring(0).equals(str.substring(0, word.length())))
            return str.substring(0, word.length());
        else return str;
    }

    //Given a string, return a string length 1 from its front,
    // unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
    public String theEnd(String str, boolean front) {
        String res = "";
        if (front == false) {
            res = str.substring(str.length() - 1);
        } else
            res = str.substring(0, 1);
        return res;
    }

    //Given a string, if the string "del" appears starting at index 1,
    // return a string where that "del" has been deleted. Otherwise, return the string unchanged
    public String delDel(String str) {
        if (str.indexOf("del") == 1)
            return (str.charAt(0) + str.substring(4));
        else
            return str;
    }

    //Given a string of odd length, return the string length 3 from its middle,
    // so "Candy" yields "and". The string length will be at least 3.
    public String middleThree(String str) {

        if (str.length() < 3)
            throw new RuntimeException("String length should be atleast 3");
        else {
            int len = str.length() / 2; //2, 4
            return (str.substring(len - 1, len + 2));
        }
    }

    //Given a string, return a string length 2 made of its first 2 chars.
    // If the string length is less than 2, use '@' for the missing chars.
    public String atFirst(String str) {
        if (str.length() == 2)
            return str;
         else if(str.length()>2)
            return str.substring(0, 2);
         else if(str.length()==1)
             return str+"@";
         else return "@@";
    }
}



