import models.Books;
import models.Genre;

import java.awt.print.Book;

public class Main2 {
    public static void main(String[] args) {
        Genre g1 = new Genre("Fiction","Best");
        Genre g2 = new Genre("Biography","Need Work");

        Books b1 = new Books("The Dark knight","max fall",g1,"My Description",2331,true);
        b1.getBookDetails();
    }
}
