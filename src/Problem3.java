import java.util.Random;

/*
 * Given an unbalanced binary tree, write code to select a node 
 * at random (each node has an equal probability of being selected). 
 */

public class Problem3 {

	/*
	 *Given the tree and the depth of the unbalanced binary tree 
	 *create a method that will select a node at random
	 */
	
	public Node selectRandomNode(BT tree){
		int depth = tree.depth;
		Node current = tree.root;
		Random random = new Random(depth);
		for (int i = 0; i < random.nextInt(); i++){
			if(coinflip() == 0){
				current = current.right;
			} else {
				current = current.left;
			}
		}
		return current;
	}

	private int coinflip() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	//Brute force way -- not very random
	//Traverse into an array and keep size counter
	//access array from index using Math.Random and length of the array
	
}
