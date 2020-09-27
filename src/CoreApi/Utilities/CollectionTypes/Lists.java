package CoreApi.Utilities.CollectionTypes;

import java.util.Iterator;
import java.util.LinkedList;

public class Lists {

    public static void lists() {

        linkedList();
    }

    private static void linkedList() {

        linkedListIterator();

        linkedListQueue();
        linkedListStack();

    }

    private static void linkedListIterator() {
        System.out.println(" ---- Iterator -----");
        LinkedList<String> names = new LinkedList<>();
        names.add("Sammy");
        names.add("Tim");
        names.add("Bailey");
        names.add( 1, "Anthony");
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
        System.out.println(names.remove());
        }
//            OR instead of making an iterator you can do this
//        for (String name : names) {
//            System.out.println(name);
//        }
    }

    private static void linkedListQueue() {
        System.out.println(" ---- Queue -----");
        LinkedList<String> names = new LinkedList<>();
        names.add("Caleb");
        names.add("Sally");
        names.add( "Eric");
        // this is an example of a Queue, FIFO: first in first out
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());
    }

    private static void linkedListStack() {
        LinkedList<String> names = new LinkedList<>();
        System.out.println(" ---- Stack -----");
        names.push("Caleb");
        names.push("Sally");
        names.push("Eric");
        // this is an example of a Stack, FILO: first in last out
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());
    }

}
