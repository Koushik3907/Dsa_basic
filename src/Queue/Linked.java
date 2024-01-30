package Queue;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
public class Linked {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Queue<Integer> h = new LinkedBlockingQueue<>(n);
	int a ;
	System.out.println("enter the elements in queue");
	for(int i=0;i<n;i++) {
		a = sc.nextInt();
		h.offer(a);
	}
	System.out.println(h);
}
}
// Blocking Queue is used when there should be no null value present in the queue