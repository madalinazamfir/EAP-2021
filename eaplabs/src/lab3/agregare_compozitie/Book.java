package lab3.agregare_compozitie;

public class Book {

    private String name;
    private Page[] pages; // Compozitie
    private Gender gender; // Agregare
    private int currentPage = 0;

    public Book(String name, int noOfPages, Gender gender) {
        this.name = name;
        this.gender = gender;
        pages = new Page[noOfPages];
    }

    public void addPage(String content) {
        Page page = new Page(currentPage, content);
        pages[currentPage] = page;
    }

    public Page[] getPages() {
        return pages;
    }

    public Gender getGender() {
        return gender;
    }
}
