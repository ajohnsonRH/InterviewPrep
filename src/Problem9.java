import java.util.Stack;

/*You have two numbers represented by a linked list,
 *  where each node contains a single digit. Write a function 
 *  that adds the two numbers and returns the sum as a linked list.
 * */
public class Problem9 {

	public class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node sum(Node n1, Node n2) {
		Stack<Node> num1 = createStack(n1);
		Stack<Node> num2 = createStack(n2);
		Node last = null;
		boolean carry = false;
		while (!num1.isEmpty() && !num2.isEmpty()) {
			int sum = num1.pop().data + num2.pop().data;
			if (carry) {
				sum = sum + 1;
				carry = false;
			}
			Node n = new Node(sum % 10);
			if (sum > 9) {
				carry = true;
			}
			if (last != null) {
				n.next = last;
			}
			last = n;
		}
		if (num2.isEmpty()) {
			return add(num1, last, carry);
		} else {
			return add(num1, last, carry);
		}
	}

	private Node add(Stack<Node> num, Node last, boolean carry) {
		while (!num.isEmpty()) {
			Node temp = num.pop();
			temp.next = last;
			last = temp;
			if (carry) {
				if (temp.data < 9) {
					temp.data = temp.data + 1;
					carry = false;
				} else {
					temp.data = 0;
				}
			}
		}
		//TODO finish this

		return null;
	}

	private Stack<Node> createStack(Node n) {
		Node temp = n;
		Stack<Node> s = new Stack<Node>();
		while (temp.next != null) {
			s.push(temp);
			temp = temp.next;
		}
		return s;
	}
}
