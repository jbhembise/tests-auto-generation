package jbhembise.testauto.example5;

public class Book extends AbstractMedia {

    private String author;

    public Book(String name, String author) {
        super(name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
