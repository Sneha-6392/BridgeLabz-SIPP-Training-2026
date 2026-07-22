import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class Main {

    static int diameter = 0;

    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    static void iterativePreorder(Node root) {
        if (root == null)
            return;

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.val + " ");

            if (node.right != null)
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
        }
    }

    static void iterativeInorder(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        Node curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.print(curr.val + " ");
            curr = curr.right;
        }
    }

    static void iterativePostorder(Node root) {
        if (root == null)
            return;

        Deque<Node> s1 = new ArrayDeque<>();
        Deque<Node> s2 = new ArrayDeque<>();

        s1.push(root);

        while (!s1.isEmpty()) {
            Node node = s1.pop();
            s2.push(node);

            if (node.left != null)
                s1.push(node.left);

            if (node.right != null)
                s1.push(node.right);
        }

        while (!s2.isEmpty())
            System.out.print(s2.pop().val + " ");
    }

    static void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.val + " ");

            if (node.left != null)
                queue.offer(node.left);

            if (node.right != null)
                queue.offer(node.right);
        }
    }

    static int height(Node root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    static void countNodesEachLevel(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.println("Level " + level + " : " + size + " nodes");

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();

                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
            }

            level++;
        }
    }

    static int heightDiameter(Node root) {
        if (root == null)
            return 0;

        int lh = heightDiameter(root.left);
        int rh = heightDiameter(root.right);

        diameter = Math.max(diameter, lh + rh);

        return 1 + Math.max(lh, rh);
    }

    static int getDiameter(Node root) {
        diameter = 0;
        heightDiameter(root);
        return diameter;
    }

    static int checkHeight(Node root) {
        if (root == null)
            return 0;

        int lh = checkHeight(root.left);
        if (lh == -1)
            return -1;

        int rh = checkHeight(root.right);
        if (rh == -1)
            return -1;

        if (Math.abs(lh - rh) > 1)
            return -1;

        return 1 + Math.max(lh, rh);
    }

    static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.print("Recursive Preorder: ");
        preorder(root);

        System.out.print("\nRecursive Inorder: ");
        inorder(root);

        System.out.print("\nRecursive Postorder: ");
        postorder(root);

        System.out.print("\nIterative Preorder: ");
        iterativePreorder(root);

        System.out.print("\nIterative Inorder: ");
        iterativeInorder(root);

        System.out.print("\nIterative Postorder: ");
        iterativePostorder(root);

        System.out.print("\nLevel Order: ");
        levelOrder(root);

        System.out.println("\nHeight: " + height(root));

        System.out.println("Nodes at Each Level:");
        countNodesEachLevel(root);

        System.out.println("Diameter: " + getDiameter(root));

        System.out.println("Balanced: " + isBalanced(root));
    }
}