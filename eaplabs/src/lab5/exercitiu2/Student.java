package lab5.exercitiu2;

public class Student implements Cloneable, Comparable<Student>, Identifiable{

    private String id;
    private String name;
    private int year;

    public Student() {
        this.id = generateId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Student o) {
        return o.name.compareTo(this.name);
    }

    @Override
    public String getId() {
        return this.id;
    }
}
