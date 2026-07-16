package linkedList;

public class TrainManagement {
    static class Node {
        int coachNo;
        Node next;
        Node(int coachNo) {
            this.coachNo = coachNo;
        }
    }
    public static Node addCoach(Node head, int coachNo) {
        Node newNode = new Node(coachNo);
        if (head == null)
            return newNode;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        return head;
    }
    public static Node removeCoach(Node head, int coachNo) {
        if (head == null)
            return null;
        if (head.coachNo == coachNo)
            return head.next;
        Node temp = head;
        while (temp.next != null && temp.next.coachNo != coachNo)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
        return head;
    }
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
    public static Node middleCoach(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.coachNo <= l2.coachNo) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null)
            tail.next = l1;
        if (l2 != null)
            tail.next = l2;
        return dummy.next;
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.coachNo + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node train = null;
        train = addCoach(train, 10);
        train = addCoach(train, 20);
        train = addCoach(train, 30);
        train = addCoach(train, 40);
        System.out.println("Train:");
        display(train);
        train = removeCoach(train, 20);
        System.out.println("After Removing Coach 20:");
        display(train);
        train = reverse(train);
        System.out.println("Reversed Train:");
        display(train);
        Node mid = middleCoach(train);
        System.out.println("Middle Coach: " + mid.coachNo);
        System.out.println("Cycle Present: " + hasCycle(train));
    }
}