package queue;

class PacketBuffer {

    private int[] data;
    private int front;
    private int count;

    PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    boolean enqueue(int packetId) {

        if (count == data.length) {
            System.out.println("Buffer Full");
            return false;
        }

        int rear = (front + count) % data.length;
        data[rear] = packetId;
        count++;
        return true;
    }

    int dequeue() {

        if (count == 0)
            throw new RuntimeException("Buffer Empty");

        int val = data[front];
        front = (front + 1) % data.length;
        count--;

        return val;
    }

    void display() {

        if (count == 0) {
            System.out.println("Buffer Empty");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(data[(front + i) % data.length] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        PacketBuffer buffer = new PacketBuffer(5);

        buffer.enqueue(101);
        buffer.enqueue(102);
        buffer.enqueue(103);

        buffer.display();

        System.out.println("Processed: " + buffer.dequeue());

        buffer.display();

        buffer.enqueue(104);
        buffer.enqueue(105);
        buffer.enqueue(106);

        buffer.display();
    }
}