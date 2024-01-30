package Maps;

import java.util.*;
import java.util.Map.Entry;



public class Hash {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Map<Integer, Integer> h =  new HashMap<>();
	//h.put(2, "KousHik");
	//System.out.println(h.get(2));
	
	ArrayList<Integer> ben = new ArrayList<>();
	System.out.println("Enter the Size");
int n = sc.nextInt();
System.out.println("Enter the Ele");
	for(int i=0;i<n;i++) {
		int p =sc.nextInt();
		ben.add(p);
	}
	for(int i=0;i<n;i++) {
		h.putIfAbsent(ben.get(i), Collections.frequency(ben, ben.get(i)));
	}
	System.out.println("Frequencies");
	for(Entry<Integer, Integer> name :h.entrySet()) {
		System.out.println(name.getKey()+":"+name.getValue());
	}
}
}
