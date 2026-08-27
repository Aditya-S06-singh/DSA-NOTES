public class Main{
    public static void main(String[] args) {
        CircularSinglyLinkedList csll1= new CircularSinglyLinkedList();
        csll1.creationOfNode(12);
        System.out.println(csll1.head.value);
        csll1.insertionCSLL(2,4);
        System.out.println(csll1.head.next.value);
        csll1.insertionCSLL(3, 6);
        System.out.println(csll1.head.next.value);
        System.out.println(csll1.head.next.next.value);
        csll1.traversalCSLL();
        csll1.SearchinginCSLL(3);
        csll1.SearchinginCSLL(12);
        csll1.deleteInCSLL(0);
        csll1.traversalCSLL();
        csll1.deleteCSll();
        csll1.traversalCSLL();
        
        
    }
}