
class Book {

    int bookId;
    String bookName;
    double price;

    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Name: " + bookName + ", Price: ₹" + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Book) {
            Book b = (Book) obj;
            return this.bookId == b.bookId
                    && this.bookName == b.bookName
                    && this.price == b.price;
        }

        return false;
    }
}

public class q2 {

    public static void main(String[] args) {
        Book b1 = new Book(1, "Physics", 1541.0);
        Book b2 = new Book(2, "Chemistry", 1475.0);

        System.out.println("Book 1: " + b1);
        System.out.println("Book 2: " + b2);

        if (b1.price > b2.price) {
            System.out.println("Book 1 is more expensive.");
        } else if (b1.price < b2.price) {
            System.out.println("Book 2 is more expensive.");
        } else {
            System.out.println("Both books have the same price.");
        }

        if (b1.equals(b2)) {
            System.out.println("Both books are the same.");
        } else {
            System.out.println("The books are different.");
        }
    }
}
