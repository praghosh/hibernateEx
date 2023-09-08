package Week4Session4;

 
/*
 * Java program to show the implementation of the GenericList class that uses 
 * an ArrayList internally to store elements of a specific type:
 */
import java.util.ArrayList;
import java.util.List;

public class GenericList<T> 
{
    private List<T> elements;

    public GenericList()
    {
        elements = new ArrayList<>();
    }

    public void addElement(T element) 
    {
        elements.add(element);
    }

    public T getElement(int index) 
    {
        if (index >= 0 && index < elements.size()) 
        {
            return elements.get(index);
        } else 
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public void printList() {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args)
    {
        GenericList<String> stringList = new GenericList <> ();
        stringList.addElement("Hello");
        stringList.addElement("World");
 
        System.out.println(stringList.getElement(0));
        System.out.println("Elements in the string list:");
        stringList.printList();

        GenericList<Integer> intList = new GenericList<>();
        intList.addElement(10);
        intList.addElement(20);

        System.out.println("Elements in the integer list:");
        intList.printList();
    }
}
