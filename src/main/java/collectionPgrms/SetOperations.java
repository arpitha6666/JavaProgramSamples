package collectionPgrms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("geeks");
        set.add("for");
        set.add("geeks");
        set.add("Geeks");
        set.add("Added");
        System.out.println("Set "+set);



        Iterator<String> itr = set.iterator();
        System.out.println("Iterator");
        while(itr.hasNext()){

            System.out.println(itr.next());
        }

        set.remove("Added");
        System.out.println("Object removed "+set);

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[]{1, 2, 5, 6, 9, 7, 4}));
        System.out.println("Integer Set "+a);
        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(
                new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

        //To find union
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        //To find intersection
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.print("intersection of the two Set");
        System.out.println(intersection);

        //To find symmetric difference
        Set<Integer> diff = new HashSet<>(a);
        diff.removeAll(b);
        System.out.print("difference of the two Set");
        System.out.println(diff);


    }
}
