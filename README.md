public class Calculator {

    // Method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method for logical AND (comparison)
    public static boolean logicalAnd(int a, int b) {
        return (a > 0 && b > 0);
    }

    public static void main(String[] args) {

        int product = multiply(6, 7);
        System.out.println("Multiplication: " + product);

        boolean result = logicalAnd(5, 3);
        System.out.println("Logical AND: " + result);
    }
}
