package main.java.org.miawe.Search;

public class Book {
    private String title;
    private String author;
    private int yearRelease;

    public Book(String title, String author, int yearRelease) {
        this.title = title;
        this.author = author;
        this.yearRelease = yearRelease;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearRelease=" + yearRelease +
                '}';
    }
}
