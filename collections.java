import java.util.*;

public class collections {
    public static void main(String[] args) {

        System.out.println("Array List");

        //ArrayList
        ArrayList<String> Fruits=new ArrayList<String>();

        // Adding elements
        Fruits.add("Apple");
        Fruits.add("Orange");
        Fruits.add("Mango");
        Fruits.add("Pineapple");
        System.out.println(Fruits);

        // Adding elements in index
        Fruits.add(1,"Grapes");
        System.out.println(Fruits);

        // Getting elements
        System.out.println(Fruits.get(1));

        // Set value
        Fruits.set(3,"Strawberry");
        System.out.println(Fruits);

        // Adding all elements in new list
        LinkedList<String> list=new LinkedList<String>();
        list.addAll(Fruits);
        System.out.println(list);

        System.out.println("Linked List");

        LinkedList<String> Animals=new LinkedList<String>();

        // Adding elements
        Animals.add("Tiger");
        Animals.add("Lion");
        Animals.add("Elephant");
        Animals.add("Zebra");
        System.out.println(Animals);

        // Adding elements in index
        Animals.add(1,"Giraffe");
        System.out.println(Animals);

        // Getting elements
        System.out.println(Animals.get(1));

        // Set value
        Animals.set(3,"Deer");
        System.out.println(Animals);

        Vector<String> forest=new Vector<String>();
        forest.addAll(Fruits);
        System.out.println(forest);

        System.out.println("Vector ");

        Vector<String> Birds=new Vector<>();

        // Adding elements
        Birds.add("Peacock");
        Birds.add("Parrot");
        Birds.add("Eagle");
        Birds.add("Sparrow");
        System.out.println(Birds);

        // Adding elements in index
        Animals.add(1,"Hen");
        System.out.println(Birds);

        // Getting elements
        System.out.println(Birds.get(1));

        // Set value
        Birds.set(3,"Crow");
        System.out.println(Birds);

        Vector<String> Trees=new Vector<String>();
        Trees.addAll(Birds);
        System.out.println(Trees);

        //HashSet
        System.out.println("HashSet");
        HashSet<Integer> hash=new HashSet<Integer>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        HashSet<Integer> hash1=new HashSet<Integer>();
        hash1.add(3);
        hash1.add(4);
        hash1.add(5);
        hash1.add(6);
        hash1.addAll(hash);
        System.out.println(hash1);
        hash1.retainAll(hash);
        System.out.println(hash1);

        System.out.println(hash);
        Iterator<Integer> it= hash.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //LinkedHashSet
        System.out.println("HashSet");
        LinkedHashSet<Integer> lhash=new LinkedHashSet<Integer>();
        lhash.add(1);
        lhash.add(2);
        lhash.add(3);
        lhash.add(4);
        HashSet<Integer> lhash1=new HashSet<Integer>();
        lhash1.add(3);
        lhash1.add(4);
        lhash1.add(5);
        lhash1.add(6);
        lhash1.addAll(lhash);
        System.out.println(lhash1);
        hash1.retainAll(lhash);
        System.out.println(lhash1);

        System.out.println(lhash);
        Iterator<Integer> lit= hash.iterator();
        while(lit.hasNext()) {
            System.out.println(lit.next());
        }

        //create TreeSet

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);


        // create a hashmap
        HashMap<String, Integer> number = new HashMap<>();

        System.out.println("Initial HashMap: " + numbers);
        // put() method to add elements
        number.put("One", 1);
        number.put("Two", 2);
        number.put("Three", 3);
        System.out.println("HashMap after put(): " + number);


        // LinkedHashMap

        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("LinkedHashMap1: " + evenNumbers);

        // Creating a LinkedHashMap from other LinkedHashMap
        LinkedHashMap<String, Integer> num = new LinkedHashMap<>(evenNumbers);
        num.put("Three", 3);
        System.out.println("LinkedHashMap2: " + num);


        // Tree Map


        TreeMap<String, Integer> evennumbers = new TreeMap<>();

        // Using put()
        evennumbers.put("Two", 2);
        evennumbers.put("Four", 4);

        // Using putIfAbsent()
        evennumbers.putIfAbsent("Six", 6);
        System.out.println("TreeMap of even numbers: " + evennumbers);

        //Creating TreeMap of numbers
        TreeMap<String, Integer> n = new TreeMap<>();
        n.put("One", 1);

        // Using putAll()
        n.putAll(evennumbers);
        System.out.println("TreeMap of numbers: " + n);
    }
}
