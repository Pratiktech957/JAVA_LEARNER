class Voter {
    // Method that may throw an exception – uses 'throws'
    static void checkEligibility(int age) throws Exception {
        if (age < 18) {
            // manually throw an exception – uses 'throw'
            throw new Exception("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Voter.checkEligibility(16); // try with invalid age
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
