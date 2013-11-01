
public class RemoveDuplicate {
    public static Node deleteDuplicates(Node head) {
        // Start typing your Java solution below
        // DO NOT write main() function
    // Start typing your Java solution below
    // DO NOT write main() function 
    Node re,tail,pre=head,cur=head;       
    re = new Node(0);
    tail=re;        
    while(cur!=null&&cur.nextNode!=null){
        while(cur.nextNode!=null&&cur.data==cur.nextNode.data) cur=cur.nextNode;
        if(pre==cur){  //distinct value                
            tail.nextNode=pre;
            tail=tail.nextNode;
        }                                         
        pre=cur.nextNode;
        cur=cur.nextNode;          
    }
    tail.nextNode=cur; //add the last value
    return re.nextNode; //dump the dummy node
    }
    public static void main(String[] args){
    	LinkedList l = new LinkedList();
    	l.addNodeFromHead(1);
    	l.addNodeFromHead(1);
    	l.addNodeFromHead(2);
    	System.out.println(l);
    	Node r = deleteDuplicates(l.head);
    	while(r!=null){
    		System.out.println(r.data);
    		r = r.nextNode;
    	}
    }
}