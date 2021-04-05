package lab7.set.exercitiu1.dto;

public class Bug implements Comparable<Bug>{

    private String title;
    private int severity;

    public Bug(String title, int severity) {
        this.title = title;
        this.severity = severity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    @Override
    public int compareTo(Bug o) {
        return this.severity - o.getSeverity();
    }

    @Override
    public String toString() {
        return "Bug{" +
                "title='" + title + '\'' +
                ", severity=" + severity +
                '}';
    }
}
