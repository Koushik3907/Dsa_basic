package Sets;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import java.util.*;
public class Linked {

	public static void main(String[] args) {
		
			Set<String> h = new LinkedHashSet<>();
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

// print the output as same as the input
