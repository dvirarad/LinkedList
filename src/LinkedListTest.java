
public class LinkedListTest {
	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		CycleLinkedList cl = new CycleLinkedList();
		cl.addNodeFromTail(1);

		cl.addNodeFromTail(4);

		cl.addNodeFromHead(5);
		cl.addNodeFromHead(1);
		System.out.println(ll);
	
		System.out.println(ll.hasLoop(ll.head));
		ll.deleteFromHead();
		ll.deleteFromHead();
		ll.deleteFromHead();
		

	}
}
