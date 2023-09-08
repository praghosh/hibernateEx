import java.util.*;
public class Test5
{
    public static void main(String[] args)
    {
        Integer a = 1000, b = 1000;
        System.out.println(a == b);
        
        long timestamp = 1531515359000L; // Sat Jul 14 02:25:59 IST 2018
        Date date = new Date(timestamp);
        System.out.println(date);

        Integer c = 127, d = 127;
        System.out.println(c == d);
    }
}