import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}
public class DeepOrgChart {
    static List<Integer> iterativePreorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            result.add(node.val);

            if (node.right != null)
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
        }
        return result;
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        System.out.println(iterativePreorder(root));
    }
}