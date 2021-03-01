package lab2.classes.todo;

//overloading
// toDoItem
public class ToDoList {
    /*
    /            / polimorfism static / polimorfism dinamic
    / locatie    / in aceeasi clasa   / original din clasa parinte, suprascrisa in copil
    / nume       /  identiv           / identic
    / argumente / diferite de la metoda la metoda / identic
    / nivelul / poate sa fie diferit sau la fel / la fel de restrictiv, sau mai permisiv decat in clasa parinte
    / return type / diferit sau la fel / identic
    */

    private ToDoItem[] toDoItem;

    public ToDoItem add(ToDoItem item) {
        toDoItem[0] = item;
        return item;
    }

    public void add(ToDoItem item, String dueDate) {

    }

    protected int add(ToDoItem item, String dueDate, boolean notification) {
        return 5;
    }
}
