package immutables;

import java.util.HashMap;
import java.util.Map;

class ImmutableWithMap {
    private final Integer id;
    private final String name;
    private final Map<String,String> metaData;

    public ImmutableWithMap(Integer id, String name, Map<String, String> metaData) {
        this.id = id;
        this.name = name;

        Map<String, String> tempMap = new HashMap<>();
        for(Map.Entry<String,String> entry : metaData.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
         this.metaData=tempMap;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getMetaData() {
        Map<String, String> tempMap = new HashMap<>();
        for(Map.Entry<String,String> entry : metaData.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    @Override
    public String toString() {
        return "ImmutableWithMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", metaData=" + metaData +
                '}';
    }
}

class TestImmutableWithMap{
    public static void main(String[] args){
        Map<String,String> mapObj = new HashMap<>();
        mapObj.put("1","First");
        mapObj.put("2","Second");
        ImmutableWithMap testObj = new ImmutableWithMap(12,"Arpita",mapObj);
        System.out.println("testObj "+ testObj);
        /*
        output:
        testObj ImmutableWithMap{id=12, name='Arpita', metaData={1=First, 2=Second}}
         */

        mapObj.put("3","Third");
        System.out.println("Added a third object to Metadata attribute, lets see what does the testObj has"+testObj);

        /*
        output
        testObj ImmutableWithMap{id=12, name='Arpita', metaData={1=First, 2=Second}}
        Added a third object to Metadata attribute, lets see what does the testObj
        hasImmutableWithMap{id=12, name='Arpita', metaData={1=First, 2=Second}}
         */

    }
}
