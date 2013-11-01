
public class Node {
	Node nextNode = null;
	int data;
	public Node(int d){
		data = d;
		nextNode = null;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String toString(){
		return Integer.toString(this.data);
	}
}
