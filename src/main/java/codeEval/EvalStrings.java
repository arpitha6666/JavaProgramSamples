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



}
