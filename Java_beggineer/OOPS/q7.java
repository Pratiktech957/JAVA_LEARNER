abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }

    public abstract void displayDetails();
}

class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public void displayDetails() {
        System.out.println("Book: " + getTitle() + ", Author: " + getAuthor() + ", Pages: " + pageCount);
    }
}

class Magazine extends LibraryResource {
    private String issueDate;

    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    public void displayDetails() {
        System.out.println("Magazine: " + getTitle() + ", Author: " + getAuthor() + ", Issue: " + issueDate);
    }
}

class DVD extends LibraryResource {
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("DVD: " + getTitle() + ", Author: " + getAuthor() + ", Duration: " + duration + " mins");
    }
}

public class q7 {
    public static void main(String[] args) {
        Book b = new Book("Java for Beginners", "Alice", 300);
        Magazine m = new Magazine("Tech World", "Editor", "March 2025");
        DVD d = new DVD("Learn Java", "Trainer", 90);

        b.displayDetails();
        m.displayDetails();
        d.displayDetails();
    }
}
