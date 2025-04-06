public class Datatype {

    // Static Variable (Class Variable)
    static String university = "SOA University";

    // Instance Variable (also called Global variable inside class)
    int rollNumber = 101;

    void showDetails() {
        // Local Variable (exists only inside this method)
        String studentName = "Pratik";

        System.out.println("Student Name (Local): " + studentName);
        System.out.println("Roll Number (Instance): " + rollNumber);
        System.out.println("University (Static): " + university);
    }

    // finalize() method (called by Garbage Collector before object is deleted)
    
    protected void finalize() throws Throwable {
        System.out.println("Deleted all the unused items (finalize called)");
    }

    public static void main(String[] args) {
        // Creating object to access instance variables
        Datatype obj = new Datatype();
        obj.showDetails();

        // Accessing static variable directly with class name
        System.out.println("Accessing Static Variable Directly: " + Datatype.university);

        // Suggest garbage collection (calls finalize() if GC runs)
        obj = null; // make object eligible for GC
        System.gc(); // request garbage collection
    }
}
