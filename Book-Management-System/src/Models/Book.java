package Models;

public class Book {
    String name;
    String author;
    String genre;
    int pages;

    public Book(String name, String author, String genre, int pages) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    void getDetails(){
        System.out.println("Name: " + name +"\nAuthor: " + author+"\nGenre: " + genre+"\nPages: " + pages);
    }
}
