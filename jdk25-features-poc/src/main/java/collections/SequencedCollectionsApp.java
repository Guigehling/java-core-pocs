package collections;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionsApp {

    // =========================================
    // SEQUENCED COLLECTIONS
    // =========================================
    static void main(String[] args) {

        SequencedCollection<String> list = new ArrayList<>();

        list.addFirst("A");
        list.addLast("B");
        list.addLast("C");

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }

}
