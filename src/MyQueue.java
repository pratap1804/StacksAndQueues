
public class MyQueue {

	private final MyLinkedList myLinkedList;
	MyStack myStack;
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

	 public boolean isEmpty() {
	        
			return myStack.isEmpty();
	    }
	    public boolean deQueue() {
	        return myStack.makeStackEmpty();
	    }
}
