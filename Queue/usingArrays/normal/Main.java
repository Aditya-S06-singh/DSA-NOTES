
public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue(7);
        boolean isEmpty =queue.isEmpty();
        boolean isFull=queue.isFull();
        System.out.println(isEmpty);
        System.out.println(isFull);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(9);
        queue.deQueue();
        queue.deQueue();
        queue.peek();
        queue.delete();

        
    }
}