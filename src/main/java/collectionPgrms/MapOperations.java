package collectionPgrms;

import java.util.*;

public class MapOperations {
    public static void main(String[] args) {

        //Hashmap
        Map<String, Integer> map = new HashMap<>();
        map.put("a", new Integer(100));
        map.put("b", new Integer(200));
        map.put("c", new Integer(300));
        map.put("d", new Integer(400));

        System.out.println("Hashmap");
        for(Map.Entry<String,Integer> itr : map.entrySet()){
            System.out.println( itr.getKey() + " : "+itr.getValue());
        }
        System.out.println("*****************");

       // LinkedHashMap

        Map<Integer, String> lmap = new LinkedHashMap<>();
       lmap.put(10,"Ars");
        lmap.put(9,"Arsfds");
        lmap.put(20,"Arlkjhgfs");
        lmap.put(4,"Arhjknms");
        lmap.put(9,"Arsfds");
        System.out.println("LinkedHashmap");
        for(Map.Entry<Integer,String> itr : lmap.entrySet()){
            System.out.println( itr.getKey() + " : "+itr.getValue());
        }

        Map<String, Integer> llmap = new LinkedHashMap<>();

        // Inserting pair entries in above Map
        // using put() method
        llmap.put("vishal", 10);
        llmap.put("sachin", 30);
        llmap.put("vaibhav", 20);
        llmap.put("sachin", 30);

        // Iterating over Map
        for (Map.Entry<String, Integer> e : llmap.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());
        System.out.println("**************************");

        // Treemap

        Map<Integer, String> tmap = new TreeMap<>();
        tmap.put(10,"Ars");
        tmap.put(9,"Arsfds");
        tmap.put(20,"Arlkjhgfs");
        tmap.put(4,"Arhjknms");
        tmap.put(9,"Arsfds");
        System.out.println("Treemap");
        for(Map.Entry<Integer,String> itr : tmap.entrySet()){
            System.out.println( itr.getKey() + " : "+itr.getValue());
        }

        Map<String, Integer> ttmap = new TreeMap<>();

        // Inserting pair entries in above Map
        // using put() method
        ttmap.put("vishal", 10);
        ttmap.put("sachin", 30);
        ttmap.put("vaibhav", 20);
        ttmap.put("sachin", 30);

        // Iterating over Map
        for (Map.Entry<String, Integer> e : ttmap.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());

        System.out.println("**************************");

        Map<Integer, String> hm1 = new HashMap<>();

        // Initialization of a Map
        // using Generics
        Map<Integer, String> hm2
                = new HashMap<Integer, String>();

        // Inserting the Elements
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");
        hm2.put(new Integer(1), "Geeks");
        hm2.put(new Integer(2), "For");
        hm2.put(new Integer(3), "Geeks");

        System.out.println(hm1);
        System.out.println(hm2);

        System.out.println("**************************");
        //changing element
        hm1.put(new Integer(2), "Geeks");
        System.out.println(hm1);
        hm1.put(new Integer(4), "For");

        System.out.println("**************************");
        //removing element
        hm1.remove(new Integer(4));
        System.out.println(hm1);
        //Count the Occurrence of numbers using Hashmap

        int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };

        // put all elements in arraylist
        ArrayList<Integer> aa = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            aa.add(a[i]);
        }

        HashMap<Integer, Integer> h = new HashMap();
        for(int i=0;i<aa.size();i++){
            h.putIfAbsent(aa.get(i),Collections.frequency(aa,aa.get(i)));

        }
        System.out.println(h);
        System.out.println("**************************");
    }
}
