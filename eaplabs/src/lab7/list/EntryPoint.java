package lab7.list;

import lab7.util.Item;
import lab7.util.ItemComparatorById;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EntryPoint {
    /*
    List (interfata):
        - modeleaza o secventa de obiecte
        - ordinea in care sunt introduse obiectele se pastreaza
        - sunt permise duplicate
     Implementari:
        - ArrayList (implementare pe baza unui array redimensionabil)
        - LinkedList (lista dublu inlantuita)
     */

    public static void main(String[] args) {
        Item item1 = new Item("item1", 1);
        Item item2 = new Item("item2", 2);

        // TODO ArrayList
        // are viteza mare de acces
        // este nerecomandata pentru liste pe care se efectueaza des operatii de insert/delete la inceputul listei
        ArrayList<Item> itemsInArrayList = new ArrayList<>();
        itemsInArrayList.add(item1);
        itemsInArrayList.add(item1);
        itemsInArrayList.add(item2);
        System.out.println(itemsInArrayList.size());
        System.out.println(itemsInArrayList.get(2));

        // TODO LinkedList
        // putem adauga/sterge obiecte pe orice pozitie
        List<Item> itemsInALinkedList = new LinkedList<>();
        itemsInALinkedList.add(item1);
        itemsInALinkedList.add(item2);
        itemsInALinkedList.add(item1);
        itemsInALinkedList.add(item2);
        itemsInALinkedList.add(0, item2);
        itemsInALinkedList.remove(3);
        itemsInALinkedList.sort(new ItemComparatorById());
        System.out.println(itemsInALinkedList);
    }
}
