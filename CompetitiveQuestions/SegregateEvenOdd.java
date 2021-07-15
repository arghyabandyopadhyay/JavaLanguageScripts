//Problem is to segregate the even no and odd numbers present in a linked list
//runner statement= java Solution {17,8,12,10,5,4,1,7,6}
class SegregateEvenOdd{		
	public static void main(String args[]){
		LinkedList linkedList=new LinkedList();
		Node new_node;
		for(String val : args){
			new_node=new Node(Integer.parseInt(val));
			linkedList.add(new_node);
		}
		linkedList.printList();
		linkedList.segregateEvenOdd();
		linkedList.printList();
	}
}
class Node{
	Node next;
	int val;
	Node(int a){
		this.next=null;
		this.val=a;
	}
}
class LinkedList{
	Node start;
	Node current;
	Node prev;
	void add(Node node){
		if(this.start==null){
			start=node;
			current=start;
		}
		else{
			current.next=node;
			current=node;
		}
	}
	void delete(){
		prev.next=prev.next.next;
		current=current.next;
	}
	void printList(){
		Node iteratorNode=start;
		while(iteratorNode!=null){
			System.out.print(iteratorNode.val+"->");
			iteratorNode=iteratorNode.next;
		}
		System.out.println("null");
	}
	void segregateEvenOdd(){
		LinkedList oddLinked=new LinkedList();

		current=start;
		while(current!=null){
			if(current.val%2!=0){
				oddLinked.add(new Node(current.val));
				if(current!=start){
					delete();
				}
				else{
					start=start.next;
					prev=current;
					current=current.next;
				}
			}
			else{
				prev=current;
				current=current.next;
			}
		}
		prev.next=oddLinked.start;
	}
}
