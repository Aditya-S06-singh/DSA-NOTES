
import java.util.Scanner;


public class CDLL{
    Scanner sc = new Scanner(System.in);
    public Node head;
    public Node tail;
    public int size;

    //Creation of a single Node
    public Node createNode(int value){
        Node node = new Node();
        node.value = value;
        node.next=node;
        node.prev=node;
        head=node;
        tail=node;
        size++;

        return head;
    }

    // INSERTION

    public void insertion(int value,int location){
        Node newNode = new Node();
        newNode.value=value;
        //head == null
        if(head==null){
           createNode(value);
        }
        // AT START
        else if(location==0){
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
            size++;
        }
        //AT LAST
        else if(location>=size){
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            tail.next=newNode;
            tail=newNode;
            size++;
        }
        // in BTW
        else{
            Node tempNode = head;
            for (int i = 0; i <location-1; i++) {
                tempNode = tempNode.next;
            }
            newNode.prev=tempNode;
            newNode.next=tempNode.next;
            tempNode.next=newNode;
            newNode.next.prev=newNode;
            size++;
        }

    
    }

    // Traversal
    @SuppressWarnings("ConvertToStringSwitch")
    public void traversal(){
        System.out.println("""
        SELECT WHAT TYPE OF TRAVERSAL DO YOU WANT 
        1. FROWARD (f)
        2. REVERSE (r)
        """);
        String input = sc.nextLine();
        input = input.toUpperCase();

        if ("F".equals(input)) {
            if (head != null) {
                Node tempNode = head;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempNode.value);
                    if (i != size - 1) {
                        System.out.print("-->");
                    }
                    tempNode = tempNode.next;
                }
                System.out.println();
            } else {
                System.err.println("NOT PRESENT");
            }
        } else if ("R".equals(input)) {
            if (head != null) {
                Node tempNode = tail;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempNode.value);
                    if (i != size - 1) {
                        System.out.print("-->");
                    }
                    tempNode = tempNode.prev;
                }
                System.out.println();
            } else {
                System.err.println("NOT PRESENT");
            }
        } else {
            System.err.println("INVALID OPTION");
        }
    }

    //SEARCHING
    public void searching(int valueToFind){
        Node tempNode = head;
        if(head==null){
            System.out.println("CDLL not present");
        }
        for (int i = 0; i <size; i++) {
            if(valueToFind==tempNode.value){
                System.out.println("Value found at index "+ i);
            }
        
            tempNode=tempNode.next;
        }
    }

    // DELETION
    public void deletion(int location){
        if(head==null)
        {
            System.out.println("WE CANT PROCEED WITH DELETION")  ;
        }
        if(size==1){
            
            head=null;
            tail=null;
            size--;
            return;
        }
        else if(location==0){
            head=head.next;
            head.prev=tail;
            tail.next=head;
            size--;
        }
        else if (location>=size){
            tail = tail.prev;
            tail.next=head;
            head.prev=tail;
            size--;
        }
        else{
            Node tempNode=head;
            for (int i = 0; i < location-1; i++) {
                tempNode=tempNode.next;                
            }
            tempNode.next=tempNode.next.next;
            tempNode.next.prev=tempNode;
            size--;
        }

    }
    //ENTIRE DELETION
    public void entireDeletion(){
        head=null;
        tail=null;
        size=0;
    }


}