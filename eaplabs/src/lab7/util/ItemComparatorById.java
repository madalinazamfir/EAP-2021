package lab7.util;

import java.util.Comparator;

public class ItemComparatorById implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getId() - o2.getId();
    }
}
