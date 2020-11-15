package cmpe272;

/**
 * This is the class for the basic main.arithmetic operators
 */
public class Arithmetic {
    public int add(int a, int b) {
        return (a + b);
    }

    public int subtract(int a, int b) {
        return (a - b);

    }

    public int multiplication(int a, int b) {
        return (a * b);
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Divison by zero is invalid");
        }
        return (a / b);
    }
}



