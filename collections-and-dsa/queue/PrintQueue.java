package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {
    private Deque<Integer> printQueue;
    public PrintQueue() {
        printQueue = new ArrayDeque<>();
    }
    void submitJob(int jobId) {
        printQueue.addLast(jobId);
        System.out.println("Normal Job Submitted: " + jobId);
    }
    void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
        System.out.println("Urgent Job Submitted: " + jobId);
    }
    int printNextJob() {
        if (printQueue.isEmpty())
            throw new RuntimeException("No jobs to print.");
        return printQueue.removeFirst();
    }
    void displayQueue() {
        System.out.println(printQueue);
    }

    public static void main(String[] args) {
        PrintQueue pq = new PrintQueue();
        pq.submitJob(101);
        pq.submitJob(102);
        pq.submitJob(103);
        pq.displayQueue();
        pq.submitUrgentJob(999);
        pq.displayQueue();
        System.out.println("Printing Job: " + pq.printNextJob());
        pq.displayQueue();
        System.out.println("Printing Job: " + pq.printNextJob());
        pq.displayQueue();
    }
}