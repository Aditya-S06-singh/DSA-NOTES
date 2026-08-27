public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.isEmpty();
        q.enQueue(10);
        q.enQueue(20);
        q.deQueue();
        q.isEmpty();
        q.delete();
    }
}