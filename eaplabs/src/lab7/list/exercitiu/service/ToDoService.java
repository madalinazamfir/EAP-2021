package lab7.list.exercitiu.service;

import lab7.list.exercitiu.dto.ToDoItem;
import lab7.list.exercitiu.exeption.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ToDoService {

    List<ToDoItem> unsolvedToDos = new LinkedList<>();
    List<ToDoItem> solvedToDos = new ArrayList<>();

    public void add(ToDoItem item) {
        if(!unsolvedToDos.contains(item)) {
            unsolvedToDos.add(item);
        } else {
            throw new ItemAlreadyExistsException("Item with id: " + item.getId() + " already exits");
        }
    }

//    public void addFirst(ToDoItem item) {
//        List<ToDoItem> copy = new LinkedList<>();
//        Collections.copy(copy, unsolvedToDos);
//        List<ToDoItem> newToDoList = new LinkedList<>();
//        newToDoList.add(0, item);
//        newToDoList.addAll(copy);
//        unsolvedToDos = newToDoList;
//    }

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
