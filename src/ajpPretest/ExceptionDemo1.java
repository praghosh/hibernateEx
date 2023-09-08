package ajpPretest;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("Finally block");
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}

