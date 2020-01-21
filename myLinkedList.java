
public class myLinkedList {
	//create node class
	class Node{
		int data;
		Node next ;
		public Node(int data) {
			super();
			this.data = data;
		}
	}
	//define head and tail
	Node head = null;
	Node tail = null;
	//////////create functions//////////////////
	//add a node in end
	public void addNode(int data){
		Node node = new Node(data);
		if(head==null){
			head=node;
			tail=node;
		}
		else{
			tail.next = node;
			tail=node;
		}
	}
	
	
	public void printLinkedList(){
		Node node = head;
		if(head==null)
			System.out.println("Node is empty");
		while(node!=null){
			if(node.next!=null)
				System.out.print(node.data+"-->");
			else
				System.out.print(node.data+"-->"+"null");
			node = node.next;
		}
	}
	//add node in beginning
	public void prependNode(int data){
		Node node = new Node(data);
		if(head==null){
			head = tail = node;
			return;
		}
		node.next = head;
		head = node;
		
	}
	
	//add node in middle
	public void insertAfter(Node prevNode, int val ){
		if(prevNode==null){
			System.out.println("Input node cant be null");
			return;
		}
		Node node = new Node(val);
		node.next = prevNode.next;
		prevNode.next = node;
	}
	
	//remove first element from LL
	public Node remove(){
		if(head==null){
			System.out.println("Nothing to remove,LL is empty");
			return null;
		}
		Node node = head;
		head = head.next;
		return node;
	}
	
	public Node removeAtIndex(int index){
		if(head==null)
		{
		System.out.println("Nothing to remove,LL is empty");
		return null;	
		}
		int count = 1;
		Node node = head;
		while(node!=null){
			if(index==0)
				return remove();
			if(count == index-1){//this is previous node to the node to be removed
				if(node == null || node.next == null)
					return null;
				else
				{	Node retNode = node;
					node.next = node.next.next;
					return retNode;
				}	
			}
			
		}
		return null;
	}

  public void reverse(){
   Node current = this.head;
   Node prev = null;
   Node next = null;
   while(current!=null){
     next = current.next;
     current.next = prev;
     prev = current;
     current= next;
   }
   this.head = prev;
  }
	
}
