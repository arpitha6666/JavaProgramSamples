package basicpgms;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args){
        String input = "aababbcc";
        Map<Character,Integer> cMap = new HashMap<>();

        for(char c : input.toCharArray()){
            cMap.put(c, cMap.getOrDefault(c,0)+1);
        }
        System.out.println(cMap);
    }
}
