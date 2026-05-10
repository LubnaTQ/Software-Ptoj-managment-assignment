public class Calculator {

// Method for modulus (remainder)
public static int modulus(int a, int b) {
    return a % b;
}

// Method for greater than (comparison)
public static boolean isGreater(int a, int b) {
    return a > b;
}

public static void main(String[] args) {

    int remainder = modulus(17, 5);
    System.out.println("Modulus: " + remainder);

    boolean result = isGreater(12, 9);
    System.out.println("Greater Than: " + result);
}
}
