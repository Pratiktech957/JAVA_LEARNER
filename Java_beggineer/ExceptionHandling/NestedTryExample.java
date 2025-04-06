public class NestedTryExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started.");

            // Nested try-catch block
            try {
                int[] numbers = {10, 20, 30};
                System.out.println("Accessing element: " + numbers[5]);  // ArrayIndexOutOfBounds
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index issue - " + e.getMessage());
            } finally {
                System.out.println("Inner finally: Finished checking the array.");
            }

            // Another risky operation in outer try
            int result = 10 / 0;  // ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Cannot divide by zero - " + e.getMessage());
        } finally {
            System.out.println("Outer finally: All operations attempted.");
        }

        System.out.println("Program continues...");
    }
}


// In Java, **`final`**, **`finally`**, and **`finalize`** are three different terms with unique purposes, though they sound similar.  

// The **`final`** keyword is used to declare constants, prevent method overriding, or stop inheritance. For example, a variable declared as `final` cannot be changed once assigned, and a `final` class cannot be subclassed.  

// The **`finally`** block is used in exception handling. It always executes after a `try-catch` block, whether an exception occurs or not. It is typically used to release resources like closing files or database connections.  

// On the other hand, **`finalize()`** is a method defined in the `Object` class. It is called by the garbage collector before destroying an object, allowing cleanup operations. However, it is now largely deprecated and not recommended in modern Java development due to unpredictability.

// In summary, **`final`** is a keyword for restrictions, **`finally`** ensures code execution after exceptions, and **`finalize()`** is a cleanup method called during garbage collection.