import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Ebook b1 = new Ebook("The Hwak", "jj.Thom", "Fiction", 150, 15.7, "APA");
        Book b2 = new Book("Emperor","k.k owen","non Fiction",200);
        Library lb = new Library(books);
        LibraryMember LM = new LibraryMember("Samip",lb);
        lb.addBook(b1);
        lb.addBook(b2);
        lb.removeBook(b2);
        LM.borrowBooks(b1);
        LM.returnBooks(b1);

    }
}