package Dequeue;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
public class Dequeee {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Deque<Integer> h =new LinkedBlockingDeque<>();
	int op;
	int a;
	System.out.println("1.Add at first\n2.Add at end\n3.Delete at first\n4.Delete at end\n5.Display top ele\n6Display last ele\n7.Display\n8.exit");
	for(int i=0;i<100;i++) {
		System.out.println("Enter the opt:");
		op =sc.nextInt();
		switch(op) {
		case 1:
			 a = sc.nextInt();
			 h.offerFirst(a);
			 break;
		case 2:
			a=sc.nextInt();
			h.offerLast(a);
			break;
		case 3:
			h.pollLast();
			break;
		case 4:
			h.pollFirst();
			break;
		case 5:
			System.out.println(h.peek());
		case 6:
			System.out.println(h.peekLast());
		case 7:
			System.out.println(h);
			break;
		case 8:
			System.exit(0);
		default:
			System.out.println("Inavalid Entry");
				
		}
		
	}
	/** implementation of iterator
	Iterator<Integer> name = h.iterator();
	while(name.hasNext()) {
		System.out.println(h);
	}
	*/
}
}
