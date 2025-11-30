package Models;

public class LibraryMember {
    String name;
    Library library;

    public LibraryMember(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void seeBooks(Book book){
        library.displayBook(book);
    }

    public void borrowBooks(Book book){
        library.removeBook(book);
        System.out.println(name+" borrowed "+book.getName());
    }

    public void returnBooks(Book book){
        library.addBook(book);
        System.out.println(name+" returned "+book.getName());
    }
}
