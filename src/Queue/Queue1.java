package Queue;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;


public class Queue1 {
public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter the capacity");
	int n = sc.nextInt();
	Queue<Integer> h = new ArrayBlockingQueue<>(n);
	for(int i =0;i<n;i++) {
		h.offer(i);   // the reason for using offer insted of add because add may throw exception 
		//in case of offer it returns the value as true or false without throwing an exception
	}
	System.out.println(h);
	System.out.println(h.poll()); // poll is used instead of remove as this is queue it follows fifo the first ele will be removed
	System.out.println(h);
	//for printing first ele
	System.out.println("First Ele"+h.peek());
	// for size of the queue
	System.out.println("Size"+h.size());
	
}
}
