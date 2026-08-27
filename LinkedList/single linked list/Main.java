public class Main{
    public static void main(String[] args) {
    SingleLinkedList s11 = new SingleLinkedList();
        s11.singlylinkedlist(11);
           System.out.println(s11.head.value);
        s11.insertinSingleLinkedlist(6, 1);
           System.out.println(s11.head.next.value);
        s11.insertinSingleLinkedlist(4, 2);
        System.out.println(s11.head.next.next.value);
        s11.traversesinglelinkedlist();
        s11.searchinginSingleLinkedList(4);
        s11.deleteInSingleLinkedList(2);
        s11.traversesinglelinkedlist();
        s11.deleteInSingleLinkedList(8);
        s11.traversesinglelinkedlist();
        s11.deleteSLL();
        s11.traversesinglelinkedlist();
    }

}