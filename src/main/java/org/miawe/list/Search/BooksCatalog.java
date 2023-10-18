package main.java.org.miawe.list.Search;

import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {
    private List<Book> bookList;

    public BooksCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int yearRelease){
        bookList.add(new Book(title, author, yearRelease));
    }

    public List<Book> searchAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();
        if(!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(b);
                }
            }
        }
        return booksByAuthor;
    }

    public List<Book> searchByIntervalYears(int initialYear, int finalYear){
        List<Book> booksByIntervalYears = new ArrayList<>();
        if(!bookList.isEmpty()){
            for(Book b: bookList){
                if (b.getYearRelease() >= initialYear && b.getYearRelease() <= finalYear){
                    booksByIntervalYears.add(b);
                }
            }
        }
        return booksByIntervalYears;
    }

    public Book searchByTitle(String title){
        Book bookByTitle = null;
        if(!bookList.isEmpty()){
            for(Book b: bookList){
                if (b.getTitle().equalsIgnoreCase(title)){
                    bookByTitle = b;
                    break;
                }
            }
        }
        return bookByTitle;
    }
}
