package lab7.list.exercitiu;

import lab7.list.exercitiu.dto.ToDoItem;
import lab7.list.exercitiu.service.ToDoService;

public class EntryPoint {
/*
To Do list:
Sa se creeze un serviciu prin care se gestioneaza ToDoItems:
    - addFirst
    - add
    - rezolve
    - seeDoTo
    - seeResolved
 */
    public static void main(String[] args) {
        ToDoItem item1 = new ToDoItem(1, "ceva");
        ToDoItem item2 = new ToDoItem(2, "ceva2");

        ToDoService service = new ToDoService();
        service.add(item2);
        service.addFirst(item1);
        System.out.println(service.showUnsolved());

        service.resolve(item2);
        System.out.println(service.showUnsolved());

    }
}
