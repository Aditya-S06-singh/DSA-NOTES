public class Main{
    public static void main(String[] args) {

        CDLL cdll = new CDLL();
        cdll.createNode(122);
        System.out.println(cdll.head.value);
        cdll.insertion(1, 123);
        cdll.insertion(2, 1);
        cdll.insertion(4,1);
        //cdll.traversal();
       // cdll.traversal();
        cdll.searching(122);
    }
}