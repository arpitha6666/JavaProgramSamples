package codeEval;

public class EvalStrings {
    //Given two strings, append them together (known as "concatenation") and return the result.
    public String concatinateStrings(String a , String b){
        return a+""+b;
    }
    //Pass a string as parameter. Find out how many vowels present in it
    public int countVowels(String obj){
        int count=0;
        char[] arr =obj.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' ||
                    arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
                count++;
            }
        }
        return count;
    }
    //Accept a string as parameter. Find out how many consonants present in it.
    public int countConsonants(String obj){
        int count=0;
        char[] arr =obj.toCharArray();

        for(int i=0;i<arr.length;i++){
            char d = Character.toLowerCase(arr[i]);
            if(!(d =='a' || d=='e' || d=='i' || d=='o' || d=='u' )){
                count++;
            }
        }
        return count;
    }
    //Given a string, return a new string where the first and last chars have been exchanged. frontBack("code") -> "eodc" ,
    // frontBack("a") -> "a" , frontBack("ab")-> "ba" , frontBack("PrograM")-> "MrograP" ,

    public String reverseFirstNLastCharInString(String obj){
        String out="";
        out = obj.charAt(obj.length()-1)+obj.substring(1,obj.length()-1)+obj.charAt(0);
        return out;
    }

    //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    public String firstHalf(String str){
        return str.substring(0,str.length()/2);
    }
    //Return true if the given string contains 1 or 3 'e' chars. Otherwise return false.
    public boolean stringE(String str){
        int count=0;
        char[] c = str.toCharArray();
        for(char d : c){
            if(d =='e' || d == 'E'){
                count++;
            }
        }
        if(count == 1  || count == 3){
            return true;
        }else return false;
    }

    //Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<>".
    // Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
    public String outWord(String out, String word){
        String res =  "";
        res=out.substring(0,out.length()-2)+word+out.substring(out.length()-2,out.length());
        return res;
    }
    //Given a string and an int n, return a string made of the first and last ' n' chars from the string. The string length will be at least n.
    public String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n,str.length());
    }

    //The web is built with HTML strings like "Yay" which draws Yay as italic text.
    // In this example, the "i" tag makes and which surround the word "Yay".
    // Given tag and word strings, create the HTML string with tags around the word, e.g. "Yay".
    public String makeTags(String tag, String word){
        return "<"+tag+">"+word+"<"+tag+">";
    }

    //Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    public String stringBits(String str){
        String res="";
        char[] c = str.toCharArray();
        for(int i=0;i<c.length;i=i+2){
            res=res+c[i];
        }
        return res;
    }

    //Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx"
    public int countXX(String str) {
        int count=0;
        char[] c = str.toCharArray();
        for(int i =0; i<c.length-1;i++){
            if((c[i] == 'X' && c[i+1]=='X') || c[i] == 'x' && c[i+1]=='x'){
                count++;
            }
        }
        return count;
    }




    }
