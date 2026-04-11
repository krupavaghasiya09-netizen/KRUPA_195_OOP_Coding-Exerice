import java.util.*;

public class GenericSearch {

  
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

       
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        System.out.println("Searching roll number 102: " +
                searchElement(rollNumbers, 102));

        System.out.println("Searching roll number 105: " +
                searchElement(rollNumbers, 105));


        LinkedList<String> names = new LinkedList<>();
        names.add("Krupa");
        names.add("Raj");
        names.add("Neha");

        System.out.println("\nSearching name 'Raj': " +
                searchElement(names, "Raj"));

        System.out.println("Searching name 'Amit': " +
                searchElement(names, "Amit"));
    }
}
