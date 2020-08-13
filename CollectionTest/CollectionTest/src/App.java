import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        Collection<String> c = new HashSet<>(); // Empty set
        Collection<String> d = Arrays.asList("one", "two");
        Collection<String> e = Collections.singleton("three");
    
        c.add("zero");
        c.addAll(d);

        Collection<String> copy = new ArrayList<String>(c);

        System.out.println(c);

        // Remove some items
        c.remove("zero");
        c.removeAll(e);
        c.retainAll(d); // Removes all but what is in d
        c.clear();      // Clears everything
        System.out.println(c);


        // Size
        boolean b = c.isEmpty();
        int s = c.size();

        System.out.println(c);
        c.addAll(copy);
        System.out.println(c);

        // Test membership
        b = c.contains("zero");
        b = c.containsAll(d);

        System.out.println(c);

        // Iterate through Collection
        int i = 1;
        for (String item : c) {
            System.out.print(i);
            System.out.print(" ");
            System.out.println(item);
            i++;         
        }

    
        // Get elements out of Collection into Array
        Object[] elements = c.toArray();
        String[] string1 = c.toArray(new String[c.size()]);
        String[] string2 = c.toArray(new String[0]);
    
    }
}
