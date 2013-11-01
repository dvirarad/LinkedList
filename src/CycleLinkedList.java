import java.util.Currency;


public class CycleLinkedList {
	Node head;
	public CycleLinkedList() {
		head = null;
	}
	public void addNodeFromHead(int n){
		if(head == null){
			head = new Node(n);
			head.nextNode = head;
		}
		else{
			Node curr = head;
			while(curr.nextNode!=head){
				curr = curr.nextNode;
			}
			Node newNode = new Node(n);
			curr.nextNode = newNode;
			newNode.nextNode = head;
			head = newNode;
			
		}
	}
	public void addNodeFromTail(int n){
		if(head==null){
			Node newNode = new Node(n);
			newNode.nextNode = newNode;
			head = newNode;
		}
		else{
			Node curr = head;
			while(curr.nextNode!=head){
				curr = curr.nextNode;
			}
			Node newNode = new Node(n);
			curr.nextNode = newNode;
			newNode.nextNode = head;		
		}
			
	}
	public String toString(){
		if(head==null)
			return "head->head";
		Node curr = head;
		String output = "head ->"+curr+"->";
		while(curr.nextNode!=head){
			
			curr = curr.nextNode;
			output = output+curr.data+"->";
		}
		return output+"head";
	}
}
