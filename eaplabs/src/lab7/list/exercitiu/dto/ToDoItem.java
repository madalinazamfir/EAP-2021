package lab7.list.exercitiu.dto;

import java.util.Objects;

public class ToDoItem {
    private int id;
    private String content;
    private boolean checked = false;

    public ToDoItem(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { // compara referinta
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ToDoItem toDoItem = (ToDoItem) o;
        return getId() == toDoItem.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", checked=" + checked +
                '}';
    }
}
