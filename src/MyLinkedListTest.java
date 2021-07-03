
import org.junit.jupiter.api.Test;
import org.junit.Assert;

class MyLinkedListTest {

	@Test
	public void given3NumbersWhenLinkedListShouldBeAddedToTop() {
		 MyNode <Integer> myFirstNode = new MyNode<>(70);
	     MyNode <Integer> mySecondNode = new MyNode<>(30);
	     MyNode <Integer> myThirdNode = new MyNode<>(56);

	       MyLinkedList myLinkedList = new MyLinkedList();
	       myLinkedList.add(myFirstNode);
	       myLinkedList.add(mySecondNode);
	       myLinkedList.add(myThirdNode);
	       myLinkedList.printMyNode();
	
	
	       boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
	       Assert.assertTrue(result);
	}
	       @Test
	   	public void given3NumbersWhenLinkedListShouldBeAddedToLast() {
	   		MyNode<Integer> myFirstNode = new MyNode<>(56);
	   		MyNode<Integer> mySecondNode = new MyNode<>(30);
	   		MyNode<Integer> myThirdNode = new MyNode<>(70);
	   		MyLinkedList myLinkedList = new MyLinkedList();
	   		myLinkedList.add(myFirstNode);
	   		myLinkedList.append(mySecondNode);
	   		myLinkedList.append(myThirdNode);
	   		myLinkedList.printMyNode();
	   		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
	   		Assert.assertTrue(result);
	   	}
	       
	       @Test
	   	public void insertNumbertinMiddle() {
	   		MyNode<Integer> myFirstNode = new MyNode<>(56);
	   		MyNode<Integer> mySecondNode = new MyNode<>(30);
	   		MyNode<Integer> myThirdNode = new MyNode<>(70);
	   		MyLinkedList myLinkedList = new MyLinkedList();
	   		myLinkedList.add(myFirstNode);
	   		myLinkedList.append(myThirdNode);
	   		myLinkedList.insert(myFirstNode, mySecondNode);
	   		myLinkedList.printMyNode();
	   		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
	   		Assert.assertTrue(result);
	   	}
	       
	       @Test
	       public void givenFirstElementWhenDeleteShouldPassLinkedListResult() {
	           MyNode<Integer> myFirstNode = new MyNode<>(56);
	           MyNode<Integer> mySecondNode = new MyNode<>(30);
	           MyNode<Integer> myThirdNode = new MyNode<>(70);
	           MyLinkedList myLinkedList = new MyLinkedList();
	           myLinkedList.add(myFirstNode);
	           myLinkedList.append(mySecondNode);
	           myLinkedList.append(myThirdNode);
	           myLinkedList.deleteFirst();
	           myLinkedList.printMyNode();
	           boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
	           Assert.assertTrue(result);
	       }
	       
	       @Test
	       public void givenLastElementWhenDeleteShouldPassLinkedListResult() {
	           MyNode<Integer> myFirstNode = new MyNode<>(56);
	           MyNode<Integer> mySecondNode = new MyNode<>(30);
	           MyNode<Integer> myThirdNode = new MyNode<>(70);
	           MyLinkedList myLinkedList = new MyLinkedList();
	           myLinkedList.add(myFirstNode);
	           myLinkedList.append(mySecondNode);
	           myLinkedList.append(myThirdNode);
	           myLinkedList.deleteLast();
	           myLinkedList.printMyNode();
	           boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.tail.equals(mySecondNode);
	           Assert.assertTrue(result);
	       }
	       
	       public void givenElementToSearchWhenMatchShouldPassLinkedListResult() {
	           MyNode<Integer> myFirstNode = new MyNode<>(56);
	           MyNode<Integer> mySecondNode = new MyNode<>(30);
	           MyNode<Integer> myThirdNode = new MyNode<>(70);
	           MyLinkedList myLinkedList = new MyLinkedList();
	           myLinkedList.add(myFirstNode);
	           myLinkedList.append(mySecondNode);
	           myLinkedList.append(myThirdNode);
	           myLinkedList.find(mySecondNode);
	           boolean result =  myLinkedList.head.getNext().equals(mySecondNode);
	           Assert.assertTrue(result);
	       }
	       
	       @Test
	       public void given4NumbersWhenInsertingThirdInBetweenShouldPassLinkedListResult() {
	           MyNode<Integer> myFirstNode = new MyNode<>(56);
	           MyNode<Integer> mySecondNode = new MyNode<>(30);
	           MyNode<Integer> myThirdNode = new MyNode<>(40);
	           MyNode<Integer> myFourthNode = new MyNode<>(70);
	           MyLinkedList myLinkedList = new MyLinkedList();
	           myLinkedList.add(myFirstNode);
	           myLinkedList.append(mySecondNode);
	           myLinkedList.append(myFourthNode);
	           myLinkedList.insertBetweenNodes(myFirstNode, myThirdNode, 3);
	           myLinkedList.printMyNode();

	           boolean result = myLinkedList.head.equals(myFirstNode) &&  myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.head.getNext().getNext().equals(myThirdNode) && myLinkedList.tail.equals(myFourthNode);
	           Assert.assertTrue(result);
	       }
	       
	       @Test
	       public void given4NumbersWhenDeletingThirdInBetweenShouldPassLinkedListResult() {
	           MyNode<Integer> myFirstNode = new MyNode<>(56);
	           MyNode<Integer> mySecondNode = new MyNode<>(30);
	           MyNode<Integer> myThirdNode = new MyNode<>(40);
	           MyNode<Integer> myFourthNode = new MyNode<>(70);
	           MyLinkedList myLinkedList = new MyLinkedList();
	           myLinkedList.add(myFirstNode);
	           myLinkedList.append(mySecondNode);
	           myLinkedList.append(myThirdNode);
	           myLinkedList.append(myFourthNode);
	           myLinkedList.deleteAtPosition(myThirdNode, 3);
	           myLinkedList.printMyNode();
	           boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFourthNode);
	           Assert.assertTrue(result);
	       }
	       
	       @Test
	       public void given4NumbersWhenAddedInAscendingOrderShouldPassLinkedList() {
	           MyNode<Integer> myFirstNode 	= new MyNode<>(56);
	           MyNode<Integer> mySecondNode = new MyNode<>(30);
	           MyNode<Integer> myThirdNode 	= new MyNode<>(40);
	           MyNode<Integer> myFourthNode = new MyNode<>(70);
	           MyLinkedList myLinkedList 	= new MyLinkedList();
	           myLinkedList.sortedLinkedList(myFirstNode);
	           myLinkedList.sortedLinkedList(mySecondNode);
	           myLinkedList.sortedLinkedList(myThirdNode);
	           myLinkedList.sortedLinkedList(myFourthNode);
	           myLinkedList.printMyNode();
	           boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.head.getNext().equals(myThirdNode) &&  myLinkedList.head.getNext().getNext().equals(myFirstNode) && myLinkedList.tail.equals(myFourthNode);
	           Assert.assertTrue(result);
	       }

}
