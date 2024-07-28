import java.util.ArrayList;

class QueueUsingArrayList {
    private ArrayList<Integer> queue;

    QueueUsingArrayList() {
        queue = new ArrayList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(int item) {
        queue.add(item);
        System.out.println(item + " enqueued to queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return Integer.MIN_VALUE;
        }
        return queue.remove(0);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return queue.get(0);
    }

    public static void main(String[] args) {
        QueueUsingArrayList q = new QueueUsingArrayList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + q.peek());
    }
}
