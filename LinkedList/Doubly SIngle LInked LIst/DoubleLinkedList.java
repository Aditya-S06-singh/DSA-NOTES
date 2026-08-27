public class DoubleLinkedList{
    DoublyNode head;
    DoublyNode tail;
    int size;
    //Creating a node
    public DoublyNode CreatingDSLL(int nodeValue){

        DoublyNode node = new DoublyNode();
        node.value=nodeValue;
        node.next=null;
        node.prev=null;
        head=node;
        tail=node;
        size++;
        return head;
                
    }

    //insertion
    public void insertioninDSLL(int value,int location){
        //if no node is present
        if(head==null){
            CreatingDSLL(value);
        }
        //at start of LINKED LIST
        DoublyNode newNode = new DoublyNode();
        newNode.value=value;
        if(location==0){
            newNode.prev=null;
            newNode.next=head;
            head.prev=newNode;
            head = newNode;
            size++; 
        }
        //at end of LINKED LIST
        else if(location>=size){
            newNode.next=null;
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
            size++;
        }
        //anywehere else
        else{
            DoublyNode currNode = head;
            for (int i = 0; i < location-1; i++) {
                currNode = currNode.next;
            }
            newNode.next=currNode.next;
            newNode.prev=currNode;
            newNode.next.prev=newNode;
            currNode.next=newNode;
            size++;
        }
    }

    //TRAVERSAL NI
    public void TraverseDLL(){
        if(head!=null){
            DoublyNode currNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(currNode.value);
                if(i!=size-1){
                    System.out.print("-->");
                }
                currNode=currNode.next;
            }
        }
        else{
            System.out.println("LINKED LIST NOT PRESENT");
        }
        System.out.println();
    }

    //REVERSE TRAVERSAL
    public void reverseTraversalDLL(){
        if(head!=null){
            DoublyNode currNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(currNode.value);
                if(i!=size-1){
                    System.out.print("<--");
                }
                currNode = currNode.prev;
            }
        }
        else{
                System.out.print("DLL doesnt exist");
            }
            System.out.println();
    }

    //Searching IN DLL

    public void SearchingDLL(int value){
        if(head!=null){
            DoublyNode currNode = head;
            for (int i = 0; i < size; i++) {
                if(currNode.value==value){
                    System.out.println("found at "+i);
                }
             currNode = currNode.next;
            }
        }
        else{
            System.out.println("LINKED LIST NOT PRESENT");
        }
    }
   
    //DELETEION IN DLL

    public void deletiondll(int location){
        if(head==null){
            System.out.println("No DLL PRESENT"); 
        }
        else{
        //ONLY ONE NODE
        if(size==1){
            head=null;
            tail=null;
            size--;       }
        //AT START
        else if(location==0){
            head=head.next;
            head.prev=null;
            size--;
        }
        //AT LAST
        else if(location>=size){
            tail=tail.prev;
            tail.next=null;
            size--;
        }
        //IN BTW
        else{
            DoublyNode currNode=head;
            for (int i = 0; i < location-1; i++) {
                currNode = currNode.next;
                
            }
            currNode.next=currNode.next.next;
            currNode.next.prev=currNode;
            size--;
        }
        }
    }

    //Entire Deletion
    public void entireDeletion(){
        head = null;
        tail=null;
        size=0;
    }

}