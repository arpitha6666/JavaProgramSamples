package immutables;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class MapImmutable {
    private Map<String,String> myMap;

    public MapImmutable(Map<String, String> myMap) {
        Map<String,String> temp = new HashMap<>();
        for(Map.Entry<String,String> ele : myMap.entrySet()){
            temp.put(ele.getKey(),ele.getValue());
        }
        this.myMap = temp;
    }

    public Map<String, String> getMyMap() {
        Map<String,String> temp = new HashMap<>();
        for(Map.Entry<String,String> ele : myMap.entrySet()){
            temp.put(ele.getKey(),ele.getValue());
        }
        this.myMap = temp;
        return myMap;
    }

    @Override
    public String toString() {
        return "Map "+myMap ;
    }
}

class TestMapImmutable {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("Arpitha","Nitte");
        map.put("Anjana","NMAMIT");
        map.put("Anusha","BMSCE");
        System.out.println(map);
        MapImmutable obj = new MapImmutable(map);
        obj.getMyMap().put("Uday","NDA");
        System.out.println(map);


    }
}
