package Models;

import java.util.List;

public class Library {
    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    void displayBook(Book book) {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getName()+" added to the library");
    }
    public void removeBook(Book book) {
        books.remove(book);
        System.out.println(book.getName()+" removed from the library");
    }
}
