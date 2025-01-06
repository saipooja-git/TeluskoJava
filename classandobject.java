

// Main class
public class classandobject extends Calculator {
    public static void main(String[] args) {
        // Create a Calculator object and pass the values 4 and 5
        Calculator calc = new Calculator(4, 5);

        // Call the add method
        int sum = calc.add();

        // Print the result
        System.out.println("The sum is: " + sum);
    }

    public classandobject(int a, int b) {
        super(a, b);
    }
}
