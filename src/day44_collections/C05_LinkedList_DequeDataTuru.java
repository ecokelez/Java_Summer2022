package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {

        Deque<String> ll4=new LinkedList();

        ll4.add("Cavidan");
        ll4.add("Selim");
        ll4.add("Emrah");
        ll4.add("Ersoy");
        ll4.add("Selim");

        ll4.removeLastOccurrence("Selim");
        System.out.println(ll4);   //  [Cavidan, Selim, Emrah, Ersoy]

        System.out.println(ll4.pop());  // Cavidan-> basındaki elemanı silip bize dondurur
        System.out.println(ll4);  //  [Selim, Emrah, Ersoy]

        ll4.remove();
        System.out.println(ll4);  // [Emrah, Ersoy]
        ll4.removeFirst();
        ll4.removeLast();

        System.out.println(ll4); // []
        /*
        Deque iki tarafl ı queue demektir,
         */
    }
}
