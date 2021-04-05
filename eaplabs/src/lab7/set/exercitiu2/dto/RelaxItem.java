package lab7.set.exercitiu2.dto;

import java.util.Set;

public abstract class RelaxItem {

    protected Set<String> genres;
    protected String title;

    public RelaxItem(String title, Set<String> genres) {
        this.genres = genres;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }


}
