import java.util.LinkedList;
import java.util.Queue;

public class Problem7 {

	class Iter {
		private Queue<Node> mQ;

		public Iter(Node root) {
			mQ = new LinkedList();
			createQ(root);
		}

		private void createQ(Node node) {
			if (node == null) {
				return;
			}
			createQ(node.left);
			mQ.add(node);
			createQ(node.right);
		}

		public Node next() {
			if (!mQ.isEmpty()) {
				return mQ.poll();
			}
			return null;
		}

	}

}
