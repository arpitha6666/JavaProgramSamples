package collectionPgrms;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("geeks");
        System.out.println("Original Array List "+arr);

        //Adding elements at specific index
        arr.add(1,"World");
        System.out.println("Element added at index 1 "+arr);

        //removing element
        arr.remove(0);
        System.out.println("Element removed at index 0 "+arr);

        //remove element by value
        arr.remove("World");
        System.out.println("after removing world "+arr);

        //updating value at 0
        arr.set(0,"GFG");
        System.out.println("Setting value at specific index "+arr);
    }

}
