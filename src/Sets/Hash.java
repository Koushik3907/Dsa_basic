package Sets;
import java.util.*;
public class Hash {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Set<String> h = new HashSet<>();
	Set<Integer> b = new HashSet<>();
	System.out.println("Size:");
	int n =sc.nextInt();
	for(int i =0;i<=n;i++) {
		int p =sc.nextInt();
		h.add("a"+i);
		b.add(p);
	}
	System.out.println(h);
	System.out.println(b);
}
}

// Hash Set doesnt follow indexing
