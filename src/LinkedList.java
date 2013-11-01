import java.util.HashMap;

import org.omg.CORBA.OBJ_ADAPTER;


public class LinkedList {
	Node head;
	public LinkedList (Node head){
		this.head = head;
	}
	public LinkedList(){
		head = null;
	}
	public boolean isEmpty(){
		return head==null;
	}
	public Node reverse(){
		if(head == null)
			return null;
		else{
			Node curr = head;
			Node next = head.nextNode;
			Node loopNode = null;
			while(curr.nextNode!=null){
				curr.nextNode = loopNode;
				loopNode = curr;
				curr = next;
				next = next.nextNode;
			}
			curr.nextNode = loopNode;
			head = curr;
			return head;
		}
	}
	public Node deleteNode(int d){
		Node curr = head;
		if(curr.data==d)
			return  head = head.nextNode;
		while(curr.nextNode!=null){
			if(curr.nextNode.data==d){
				curr.nextNode=curr.nextNode.nextNode;
				return head;
			}
			curr = curr.nextNode;
		}
		return head;
	}
	public Node deleteFromEnd(){
		if(head == null)
			return null;
		else{
			Node curr = head;
			while(curr.nextNode.nextNode!=null){
				curr = curr.nextNode;
			}
			curr.nextNode = null;
			return head;
		}
	}
	public Node deleteFromHead(){
		if(head == null)
			return null;
		else{
			head = head.nextNode;
		}
		return head;
	}
	public void addNodeFromTail(int d){
		if(head==null){
			head = new Node(d);
		}
		else{
			Node curr = head;
			while(curr.nextNode!=null){
				 curr = curr.nextNode;
			}
			curr.nextNode=new Node(d);
		}
	}
	public void addNodeFromHead(int d){
		if(head == null)
			head = new Node(d);
		else{
			Node newNode = new Node(d);
			newNode.nextNode = head;
			head = newNode;
		}
	}
	public String toString(){
		if(head == null)
			return "head -> null";
		Node curr = head;
		String output = "head ->";
		while(curr!=null){
			output = output + curr.data+"->";
			curr = curr.nextNode;
		}
		return output + "tail";
	}
	/**
	 * Detect if a Linkedlist has a loop or not
	 * @param head
	 * @return
	 */
	public boolean hasLoop (Node head){
		if(head == null)
			return false;
		Node slowNode = head;
		Node fast = head;
		while(fast!=null && fast.nextNode!=null) {
			slowNode = slowNode.nextNode;
			fast = fast.nextNode.nextNode;
			if(slowNode == fast)
				return true;
		}
		return false;
	}
}
