package Sets;
import java.util.*;
public class Tree {
public static void main(String[] args) {
	Set<String> h = new TreeSet<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Size");
	int n = sc.nextInt();
	for(int i =0;i<n;i++) {
		String b = sc.next();
		h.add(b);
	}
	System.out.println(h);
}
}
//tree set sort in natural order i.e input = 9,1,8 and then the output will be 1,8,9