public class CircularSinglyLinkedList{
    
    //Node head,tail,size
    public Node head;
    public Node tail;
    public int size;

    // creation of new circularLinkedList

    public Node creationOfNode(int nodeValue){
        Node node = new Node();
        node.value=nodeValue;
        node.next=node;
        head=node;
        tail=node;
        size ++;
        return head;

    }
    // insertion in CSLL
    public void insertionCSLL(int nodeValue,int location){
        Node node = new Node();
        node.value=nodeValue;
        //NO NODE IN CSLL

            if(head == null){
               creationOfNode(nodeValue);
            }
        //BEGINNING OF THE NODE
            else if(location ==0){
            node.next=head;
            head = node;
            tail.next=head;
            size++;
            }
        //end OF THE NODE    
            else if(location>=size){
                tail.next=node;
                tail=node;
                tail.next=head;   
                size++;           
            }
        //AT SPECIFIED LOCATION
            else{
                Node tempNode= new Node();
                int index=0;
                while(index<location-1){
                    tempNode=tempNode.next;
                    index++;
                }
                node.next=tempNode.next;
                tempNode.next=node;
                size++;
            }
    }
    //TRAVERSAL
    public void traversalCSLL(){
        Node tempNode= head;
        if(head!=null){
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("-->");
                }
                tempNode=tempNode.next;
            }
            System.out.println("");
        }
        else{
            System.out.println("CSLL not present");
        }
    }
    //Searching in CSLL
    public void SearchinginCSLL(int value){
        Node tempNode=head;
        for (int i = 0 ;i < size; i++){
            if(tempNode.value==value){
                System.out.println("Value"+tempNode.value+"index"+i);
                break;
            }
            else{
                System.out.println("not found");
            }
            tempNode=tempNode.next;

        }
        
    }
    //DELETION IN CSLL
    public void deleteInCSLL(int location){
        
        if(head==null){
            System.out.println("CSLL not present");
        }
        //Start of CSLL
        else if(location==0){
            head = head.next;
            tail.next=head;
            size--;
            if(size==0){
                
                tail=null;
                head.next=null;
                head=null;

            }
        }
        //END of CSLL
        else if(location>=size){
             Node tempNode = head;
             for (int i = 0; i < size-1; i++) {
                 tempNode=tempNode.next;
             }
             if(tempNode==head){
                head.next=null;
                tail = head = null;
             }
             tempNode.next=head;
             tail=tempNode;
             size--;

        }
        //IN BTW
        else{
            Node tempNode=head;
            for (int i = 0; i < location-1; i++) {
                tempNode=tempNode.next;   
            }
            tempNode.next=tempNode.next.next;
            size--;
        }
    }
    //DELETE WHOLE OF CSLL
    public void deleteCSll(){
        if(head==null){
            System.out.println("");
        }
        else{
            head=null;
            tail.next=null;
            tail=null;
            System.out.println("Fully deleted");
        }
    }

}
