import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyBinarySearchTest {

	   @Test
	    public void given3NumbersWhenAddedToBinaryTreeShouldreturnSizeThree() {
	        MyBinarySearch<Integer> myBinaryTree = new MyBinarySearch<>();
	        myBinaryTree.add(56);
	        myBinaryTree.add(30);
	        myBinaryTree.add(70);
	        int size = myBinaryTree.getSize();
	        Assert.assertEquals(3, size);
	    }
}
