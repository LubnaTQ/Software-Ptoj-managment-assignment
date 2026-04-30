public class Calculator {

    // Method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        int sum = add(10, 5);
        System.out.println("Addition: " + sum);

        double result = divide(10, 2);
        System.out.println("Division: " + result);
    }
}
