package LinkedList;

import java.util.*;



public class Linkedlist {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> list = new LinkedList<>();
	int op;
	for(int i =0;i<100;i++) {
		System.out.println("1.Add the Element(End)\n2.Delete the element(End)\n3.Add at specific pos\n"
				+ "4.Delete at specific pos\n5.Add At Start\n6.Delete at Start\n7.Display");
		System.out.println("\nEnter the option");
		op =sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("Enter the Element into the List(at End)");
			int n =sc.nextInt();
			list.addLast(n);
			break;
		case 2:
			if(list.isEmpty()==false) {
			System.out.println("Deleted the Element (End)\n");
			list.removeLast();
			}
			else {
				System.out.println("No Elements is present");
			}
			break;
		case 3:
		 if(list.isEmpty()==false) {
			 System.out.println("Enter the index pos");
			 int x =sc.nextInt();
			 System.out.println("Enter the num");
			 int c =sc.nextInt();
			 list.add(x,c);
		 }
		 else {
			 System.out.println("No element is present \nso added at starting of the list");
			 int x=sc.nextInt();
			 list.add(x);
		 }
		 break;
		case 4:
			if(list.isEmpty()==false) {
				 System.out.println("Enter the index");
				 int c =sc.nextInt();
				 list.remove(c);
			}
			else {
				System.out.println("No elements present");
			}
			break;
		case 5:
			System.out.println("Enter the Element into the List(at Start)");
			int p =sc.nextInt();
			list.addFirst(p);
			break;
		case 6:
			if(list.isEmpty()==false) {
				System.out.println("Deleted the Element (Start)\n");
				list.removeFirst();
				}
				else {
					System.out.println("No Elements is present");
				}
				break;
		case 7:
			if(list.isEmpty()==false) {
		
				System.out.println(list);
			
			}
			else {
				System.out.println("No Elements are present");
			}
			break;
			default:
				System.out.println("Invalid Entry");
			
		}
	}
}
}
