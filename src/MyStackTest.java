import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyStackTest {

	@Test
	
	public void givenThreeNumberWhenAddedToStackShouldHaveLastAddedNode() {
	MyNode <Integer> myFirstNode = new MyNode<>(70);
    MyNode <Integer> mySecondNode = new MyNode<>(30);
    MyNode <Integer> myThirdNode = new MyNode<>(56);
	
	MyStack myStack  = new MyStack();
	myStack.push(myFirstNode);
	myStack.push(mySecondNode);
	myStack.push(myThirdNode);
	
	myStack.printMyStack();
	INode peak = myStack.peak();
	Assert.assertEquals(myThirdNode, peak);
	}
}
