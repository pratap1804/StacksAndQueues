
public class MyLinkedList {
	public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        
    }

    public void add(INode newNode) {
        if(this.tail == null){
            this.tail = newNode;
        }
        if(this.head == null){
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    
    public void append(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
    
    public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
    
    public INode deleteFirst() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    
    public INode deleteLast() {
		INode tempNode = head;
        while (!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
		
	}
    
    public INode find(INode searchKey) {

        INode tempNode = this.head;
        while (tempNode != null) {
            if (tempNode == searchKey) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
    
    public INode insertBetweenNodes(INode head, INode newNode, int position){
        INode previous = head;
        int count = 1;
        while (count < position - 1){
            previous = previous.getNext();
            count++;
        }
        INode current = previous.getNext();
        newNode.setNext(current);
        previous.setNext(newNode);
        return head;
    }
    
    public INode deleteAtPosition(INode head, int position) {
        INode previous = head;
        int count = 1;
        while (count < position - 1) {
            previous = previous.getNext();
            count++;
        }
        INode current = previous.getNext();
        previous.setNext(current.getNext());
        current = null;
        System.out.println("size of linklist:"+length(head));
        return current;
    }

    public int length(INode head){
        INode tempNode = head;
        int count = 0;
        while (tempNode!=null){
            count++;
            tempNode=tempNode.getNext();
        }
        return count;
    }
    
    public void sortedLinkedList (INode newNode ) {
        if (head == null || ((Comparable) head.getKey()).compareTo(newNode.getKey()) > 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            INode tempNode = head;
            while (tempNode.getNext() != null && ((Comparable) tempNode.getNext().getKey()).compareTo(newNode.getKey()) < 0) {
                tempNode = tempNode.getNext();
            }
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
        }
    }
    
    public void printMyNode(){
        StringBuffer myNode= new StringBuffer("My Node: ");
        INode tempNode = head;
        while(tempNode.getNext() != null){
            myNode.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNode.append("->");
            tempNode = tempNode.getNext();
        }
        myNode.append(tempNode.getKey());
        System.out.println(myNode);
    }
}
