package models;

public class Books {
    String name;
    String author;
    Genre genre;
    String description;
    int price;
    boolean inDiscount;

    public Books(String name, String author, Genre genre, String description, int price, boolean inDiscount) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.price = price;
        this.inDiscount = inDiscount;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public boolean isInDiscount() {
        return inDiscount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setInDiscount(boolean inDiscount) {
        this.inDiscount = inDiscount;
    }
    public void getBookDetails(){
        System.out.println("The name of the book is "+this.name +" and author is "+this.author+" and genre is "+this.genre +". The discription is "+this.description+" and price is "+this.price);
    }
}
