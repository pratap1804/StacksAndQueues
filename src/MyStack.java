
public class MyStack {

	private final MyLinkedList myLinkedList;
	
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
	myLinkedList.add(myNode);
	}

	public void printMyStack() {
		myLinkedList.printMyNode();
		
		
	}
	public INode peak() {
		return myLinkedList.head;
		
	}

	public INode pop() {
		return myLinkedList.deleteFirst();
	}
	
	 public int length() {
	        return myLinkedList.length();
	    }
	
	 public boolean isEmpty() {
	     
		 if (length() == 0) {
	        System.out.println("It is Empty");
	        	return true;
	     
		 } else {
	          System.out.println("It is not Empty");
	           	return false;
	      }
	    
	 }

	    public boolean makeStackEmpty(){
	        
	    	MyStack myStack = new MyStack();
	        
	    	while(!myStack.isEmpty()){
	            pop();
	        }
	        return true;
	    }
}
