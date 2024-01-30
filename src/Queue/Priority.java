package Queue;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class Priority {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Queue<Integer> h = new PriorityBlockingQueue<>(n);
	int a ;
	System.out.println("enter the elements in queue");
	for(int i=0;i<n;i++) {
		a = sc.nextInt();
		h.offer(a);
	}
	System.out.println(h);
}
}
