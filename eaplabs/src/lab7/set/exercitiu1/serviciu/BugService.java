package lab7.set.exercitiu1.serviciu;

import lab7.set.exercitiu1.dto.Bug;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class BugService {

    private Set<Bug> bugs = new TreeSet<>();

    public void add(Bug ...bugsToAdd) {
        for(Bug bugToAdd: bugsToAdd) {
            bugs.add(bugToAdd);
        }
    }

    public Set<Bug> getAll() {
        return bugs;
    }
}
