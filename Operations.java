public class Calculator {

    // Method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method for equal to comparison
    public static boolean isEqual(int a, int b) {
        return a == b;
    }

    public static void main(String[] args) {

        int difference = subtract(20, 7);
        System.out.println("Subtraction: " + difference);

        boolean result = isEqual(15, 15);
        System.out.println("Equal To: " + result);
    }
}
