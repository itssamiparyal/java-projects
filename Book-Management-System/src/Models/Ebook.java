package Models;

public class Ebook extends Book {
    double size;
    String format;

    public Ebook(String name, String author, String genre, int pages, double size, String format) {
        super(name, author, genre, pages);
        this.size = size;
        this.format = format;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    void getDetails(){
        super.getDetails();
        System.out.println("Size: " + size + "\n Format: " + format);
    }
}
