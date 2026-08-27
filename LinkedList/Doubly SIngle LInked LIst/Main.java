public class Main{
    public static void main(String[] args){
       DoubleLinkedList dll = new DoubleLinkedList();
       dll.CreatingDSLL(1);
       System.out.println(dll.head.value);
       dll.insertioninDSLL(2, 0);
       System.out.println(dll.head.value);
       dll.insertioninDSLL(3, 0);
       System.out.println(dll.head.value);
       dll.TraverseDLL();
       dll.reverseTraversalDLL();
       dll.SearchingDLL(2);
       dll.deletiondll(0);
       dll.TraverseDLL();
    }
}