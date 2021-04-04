package lab7.map;

import lab7.util.Item;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EntryPoint {

    /*
    Map (interfata):
        - modeleaza un grup de key-value
        - key si value sunt obiecte (nu se pot folosi primitive)
        - nu sunt permise key duplicate
     Implementari:
        - HashMap
     */

    public static void main(String[] args) {
        Item item1 = new Item("item1", 1);
        Item item2 = new Item("item2", 2);
        Item item3 = new Item("item3", 3);

        // TODO HashMap
        HashMap<String, Item> itemsInAHasMap = new HashMap<>();
        itemsInAHasMap.put("key1", item1);
        itemsInAHasMap.put("key2", item2);
        itemsInAHasMap.put("key1", item3);

        System.out.println(itemsInAHasMap.get("key1"));
        System.out.println(itemsInAHasMap.containsKey("key3"));
        System.out.println(itemsInAHasMap.containsValue(item3));

        // TODO TreeMap
        // elementele sunt sortate in ordinea naturala a cheiilor, sau in ordinea aleasa de programator furnizand un Comparator

        Map<String, Item> itemsInATreeMap = new TreeMap<>();
        itemsInATreeMap.put("key42", item1);
        itemsInATreeMap.put("key25", item1);
        itemsInATreeMap.put("key41", item1);
        itemsInATreeMap.put("key1", item1);
        System.out.println(itemsInATreeMap.keySet());

        Map<String, Item> itemsInATreeMapWithComparator = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        itemsInATreeMapWithComparator.put("key42", item1);
        itemsInATreeMapWithComparator.put("key25", item1);
        itemsInATreeMapWithComparator.put("key41", item1);
        itemsInATreeMapWithComparator.put("key1", item1);
        System.out.println(itemsInATreeMapWithComparator.keySet());
    }
}
