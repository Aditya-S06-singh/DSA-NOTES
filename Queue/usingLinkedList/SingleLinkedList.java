public class SingleLinkedList{
public Node head;
public Node tail;
public int size;

public Node singlylinkedlist(int nodeValue){
 head = new Node();
 Node node = new Node();
 node.next=null;
 node.value=nodeValue;
 head=node;
 tail=node;
 size =1;
 return head;
}
//insertion
public void insertinSingleLinkedlist(int nodeValue,int location){
    Node node = new Node();
    node.value=nodeValue;
    //null
    if(head == null){
        singlylinkedlist(nodeValue);
        return;
    }
    //at start
    else if(location==0){
        node.next=head;
        head=node;
    }
    //at last
    else if(location >=size){
        node.next =null;
        tail.next=node;
        tail=node;
    
//in b/w
    }else{
       Node tempNode = head;
       int index=0;
       while(index<=location-1){
        tempNode=tempNode.next;
        index++;
       }
       Node nextNode= tempNode;
       tempNode.next = node;
       node.next=nextNode;
    }
    size++;


}
//traversal
public void traversesinglelinkedlist(){
    if(head==null){
        System.out.println("NO linked list is present");

    }
    else{
        Node tempNode=head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print(" -> ");
            }
            tempNode=tempNode.next;
        }
    }
    System.out.println("\n");
    
}
// searching
public int searchinginSingleLinkedList(int nodeValue){
    Node currentNode=head;
    System.out.println("Starting searching in linked list");
    if(currentNode==null){
        System.out.println("Searching cant be performed cause no node is created ");
        return -1;
    }
    for (int i = 0; i < size; i++){
        if(currentNode.value==nodeValue){
            System.out.println("Value found at index :"+ i);
            return i;
        }
        else{
            currentNode=currentNode.next;
        }
    }
    System.out.println("Value not found");
    return -1;

}
//Deletion
public void deleteInSingleLinkedList(int location){
    //if linked list is empty 
 if(head==null){
    System.out.println("Single klinked list does not exist");
 }
 //at start of SLL
 else if(location==0){
        head=head.next;
        size--;
        if(size==0){
            tail=null;
        }
        System.out.println("SLL at start of linked list was deleted");
    }
//at end of SLL
else if(location>=size){
    Node secondLastNode = head;
    if(size==1){
            tail=head=null;
            size--;
            return;
        }
    for (int i = 0; i < size-1; i++) {
        secondLastNode=secondLastNode.next;
    }
    secondLastNode.next=null;
        tail=secondLastNode;
        size--;
}
// in b/w
else{
    Node currentNode=head;
    for (int i = 0; i < location-1; i++) {
        currentNode=currentNode.next;
    }
    currentNode.next=currentNode.next.next;
    size--;
    System.out.println("deleted in between");
}

 }
 //deletion of entire SLL
 public void deleteSLL(){
    head =null;
    tail=null;
    
 }
}
