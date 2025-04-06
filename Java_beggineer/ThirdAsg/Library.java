
import java.util.*;

class Book {

    int id;
    String name, author;
    int quantity;

    Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public String toString() {
        return id + " - " + name + " by " + author + " (Qty: " + quantity + ")";
    }
}

public class Library {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Book> map = new HashMap<>();

        map.put(1, new Book(1, "Java", "James", 5));
        map.put(2, new Book(2, "Python", "Guido", 3));

        System.out.println("Books in Library:");
        for (Book b : map.values()) {
            System.out.println(b);
        }

        System.out.print("\nEnter book name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Book b : map.values()) {
            if (b.name.equalsIgnoreCase(name)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Book found!" : "Book not found!");

        System.out.print("\nEnter book ID to remove: ");
        int id = sc.nextInt();
        map.remove(id);

        System.out.println("\nUpdated Library:");
        for (Book b : map.values()) {
            System.out.println(b);
        }

        sc.close();
    }
}
