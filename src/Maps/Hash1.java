package Maps;

import java.util.*;
import java.util.Map.Entry;

public class Hash1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> h = new HashMap<>();
       // h.put(2, "KousHik");

        ArrayList<Integer> ben = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            ben.add(p); // Add elements to ben
        }

        for (int i = 0; i < n; i++) {
            h.putIfAbsent(ben.get(i),Collections.frequency(ben, ben.get(i)));
        }

        // Print the Map entries
        for (Entry<Integer, Integer> entry : h.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
