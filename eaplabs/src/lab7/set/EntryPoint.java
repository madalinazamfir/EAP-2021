package lab7.set;

import lab7.util.Item;
import lab7.util.ItemComparatorById;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EntryPoint {
    /*
    Set (interfata):
        - emuleaza conceptul matematic de multime
        - nu mentine ordinea elementelor
        - nu permite duplicate
    Implementari ale lui Set:
        - HashSet (implementare cu hash table)
        - LinkedHashSet (implementare cu hash table + list)
        - TreeSet (implementare cu arbore binar)
     */
    public static void main(String[] args) {
        Item item1 = new Item("item1", 1);
        Item item2 = new Item("item2", 2);
        Item item3 = new Item("item3", 3);

        // TODO HashSet
        // un Set construit pe baza unui hash table - hashCode
        // nu garanteaza ordinea obiectelor la iteratie

        hashSetExample(item1, item2, item3);

        // TODO LinkedHashSet
        // elementele sunt dublu inlantuite printr o lista
        // pastreaza ordinea de insertie a elementelor

//        linkedHashSetExample(item1, item2, item3);

        // TODO TreeSet
        // elementele sunt pastrate ordonate ascendent
        // constructor supraincarcat ce primeste ca parametru un Comparator pentru specificarea regulilor de ordonare
        // mai lent
        // obiectele adaugate intr un TreeSet trebuie sa implementeze interfata Comparable

        treeSetExample(item1, item2, item3);
    }

    private static void treeSetExample(Item item1, Item item2, Item item3) {
        TreeSet itemsInATreeSet = new TreeSet();
        itemsInATreeSet.add(item1);
        itemsInATreeSet.add(item3);
        itemsInATreeSet.add(item2);

        for (Object item: itemsInATreeSet) {
            System.out.println(item);
        }
        System.out.println("breakpoint");

        TreeSet itemsInATreeSetWithCompare = new TreeSet(new ItemComparatorById());
        itemsInATreeSetWithCompare.add(item1);
        itemsInATreeSetWithCompare.add(item3);
        itemsInATreeSetWithCompare.add(item2);

        itemsInATreeSetWithCompare.add(new Item("item0", 0));


        for (Object item: itemsInATreeSetWithCompare) {
            System.out.println(item);
        }
    }


    private static void linkedHashSetExample(Item item1, Item item2, Item item3) {
        LinkedHashSet itemsInALinkedHashSet = new LinkedHashSet();

        itemsInALinkedHashSet.add(item3);
        itemsInALinkedHashSet.add(item2);
        itemsInALinkedHashSet.add(item1);

        for (Object item : itemsInALinkedHashSet) {
            System.out.println(item);
        }
    }

    private static void hashSetExample(Item item1, Item item2, Item item3) {
        // add & addAll
        Set itemsInAHashSet = new HashSet();
        itemsInAHashSet.add(item1);
        itemsInAHashSet.add(item2);
        itemsInAHashSet.add(item3);
        itemsInAHashSet.add("alabala"); // rolul genericelor este de a restrictiona obiectele adaugate in colectie
        itemsInAHashSet.addAll(Arrays.asList(item1));

        System.out.println(itemsInAHashSet.add(item1)); // returns false pentru ca item1 a fost deja adaugat
        for(Object item : itemsInAHashSet) {
            System.out.println(item);
        }

        // contains apeleaza metoda equals a obiectelor comparate - in cazul nostru Item
        System.out.println(itemsInAHashSet.contains(item1));
        System.out.println(itemsInAHashSet.contains(new Item("item1", 1)));
        // containsAll
        itemsInAHashSet.containsAll(Arrays.asList(item1));

        // remove & removeAll
        itemsInAHashSet.remove(item1);

        // retainAll - pastreaza doar elementele date ca parametru si sterge restul elementelor care nu sunt continute de colectia data ca parametru. Daca nu exista in set-ul initial, nu este adaugat
        itemsInAHashSet.retainAll(Arrays.asList(item1, item3));
        for(Object item : itemsInAHashSet) {
            System.out.println("Am ramas: " + item);
        }

        // utile
        itemsInAHashSet.size(); // daca pana acum la arrays aveam .length...la colectii avem .size();
        itemsInAHashSet.isEmpty(); // returns true daca colectia e goala
        Iterator iterator = itemsInAHashSet.iterator();
        while(iterator.hasNext()) {
            System.out.println("Inca un item");
            break;
        }
        itemsInAHashSet.clear(); // sterge toate elementele din colectie
    }
}
