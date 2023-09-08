package ajpPretest;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("123abc");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        } finally {
            System.out.println("Finally block");
        }
    }
}