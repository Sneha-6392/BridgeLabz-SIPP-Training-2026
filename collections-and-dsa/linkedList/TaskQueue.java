package linkedList;

class Node {
    int taskId;
    Node next;

    Node(int taskId) {
        this.taskId = taskId;
        this.next = null;
    }
}

public class TaskQueue {
    public static Node removeTask(Node queueHead, int completedTaskId) {
        if (queueHead == null)
            return null;
        if (queueHead.taskId == completedTaskId)
            return queueHead.next;
        Node previousTask = queueHead;
        Node currentTask = queueHead.next;
        while (currentTask != null && currentTask.taskId != completedTaskId) {
            previousTask = currentTask;
            currentTask = currentTask.next;
        }
        if (currentTask != null)
            previousTask.next = currentTask.next;
        return queueHead;
    }
    public static void display(Node queueHead) {
        Node currentTask = queueHead;
        while (currentTask != null) {
            System.out.print(currentTask.taskId + " -> ");
            currentTask = currentTask.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node queueHead = new Node(101);
        queueHead.next = new Node(102);
        queueHead.next.next = new Node(103);
        queueHead.next.next.next = new Node(104);
        System.out.println("Before Removing:");
        display(queueHead);
        queueHead = removeTask(queueHead, 103);
        System.out.println("After Removing Task 103:");
        display(queueHead);
    }
}