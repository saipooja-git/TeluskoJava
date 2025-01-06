// Define the Calculator class
public class Calculator {
    private int a; // Declare instance variables
    private int b;

    // Constructor to initialize the variables
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to perform addition
    public int add() {
        return a + b; // Return the sum of instance variables
    }
}