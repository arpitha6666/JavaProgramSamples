package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class CompressToProperString {

    public static void main(String[] args){

        String input = "a2b5c3a2";
        char[] ch = input.toCharArray();

        Set<String> seen = new LinkedHashSet<>();
        for(int i=0;i<input.length();i++){
          if(Character.isLetter(ch[i]))
               seen.add(String.valueOf(ch[i])) ;
        }
        StringBuffer sb = new StringBuffer();
        for(String s : seen)
            sb.append(s);
        System.out.println(sb);
    }
}
