
public class MyQueue {

	private final MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void enQueue(INode myNode) {
		myLinkedList.append(myNode);
	}
	
	public void printQueue() {
		myLinkedList.printMyNode();
	}
	
	public INode peak() {
		return myLinkedList.head;
	}
}
