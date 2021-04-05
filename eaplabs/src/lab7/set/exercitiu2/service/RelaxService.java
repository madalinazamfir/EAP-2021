package lab7.set.exercitiu2.service;

import lab7.set.exercitiu2.dto.RelaxItem;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RelaxService {

    Set<RelaxItem> relaxItems = new HashSet<>();

    public void add(RelaxItem... items) {
        Collections.addAll(relaxItems, items);
    }

    public Set<RelaxItem> strictSearch(Set<String> genres) {
        Set<RelaxItem> foundItems = new HashSet<>();
        for(RelaxItem item : relaxItems) {
            if(item.getGenres().containsAll(genres)) {
                foundItems.add(item);
            }
        }
        return  foundItems;
    }

    public Set<RelaxItem> search(Set<String> genres) {
        Set<RelaxItem> foundItems = new HashSet<>();
        for(String genre : genres) {
            Set<RelaxItem> found = strictSearch(Collections.singleton(genre));
            foundItems.addAll(found);
        }
        return foundItems;
    }
}
