package lab7.list.exercitiu.service;

import lab7.list.exercitiu.dto.ToDoItem;
import lab7.list.exercitiu.exeption.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ToDoService {

    LinkedList<ToDoItem> unsolvedToDos = new LinkedList<>();
    List<ToDoItem> solvedToDos = new ArrayList<>();

    public void add(ToDoItem item) {
        if(!unsolvedToDos.contains(item)) {
            unsolvedToDos.add(item);
        } else {
            throw new ItemAlreadyExistsException("Item with id: " + item.getId() + " already exits");
        }
    }

    public void addFirst(ToDoItem item) {
        unsolvedToDos.addFirst(item);
    }

    public void resolve(ToDoItem item) {
        if(!unsolvedToDos.contains(item)) {
            throw new RuntimeException("Item doesn't exist");
        }
        for (ToDoItem itemToBeFound: unsolvedToDos) {
            if (itemToBeFound.equals(item)) {
                unsolvedToDos.remove(itemToBeFound);
                itemToBeFound.setChecked(true);
                solvedToDos.add(itemToBeFound);
            }
        }
    }

    public List<ToDoItem> showUnsolved() {
        return unsolvedToDos;
    }
}
