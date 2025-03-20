package collectionPgrms;

import java.util.LinkedList;

public class LinkedListOperations {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("hello");
        ll.add("Geeks");
        ll.add("World");
        System.out.println("Original Linked List " + ll);


        ll.remove("World");
        System.out.println(" Linked List with world object removed" + ll);

        ll.set(1, "World");
        System.out.println(" Linked List with world set " + ll);

        System.out.println(" Size of Linked List " + ll.size());

        //convert to array
        Object[] arr = ll.toArray();
        for (Object i : arr) {
            System.out.println(i.toString());
        }

        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println(" Linked List " + ll);

        ll.removeFirst();
        System.out.println(" Linked List " + ll);
        ll.removeLast();
        System.out.println(" Linked List " + ll);

    }
}
