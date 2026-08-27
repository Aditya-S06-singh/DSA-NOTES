public class Queue{

    SingleLinkedList sll ;

    public Queue(){
        sll = new SingleLinkedList();
        System.out.println("Queue is created");
    }
    public boolean isEmpty(){
        return sll.head==null;
    }

    public void enQueue(int value){
        sll.insertinSingleLinkedlist(value, sll.size);
        System.out.println("Sucessfully inserted :"+value);
    }

    public int deQueue(){
        if(isEmpty()){
            return -1;

        }
        else{
            int value = sll.head.value;
            sll.deleteInSingleLinkedList(0);
            return value;
        }
     
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }else{return sll.head.value;}
        
    }

    public void delete(){
        sll.deleteSLL();
    }

  
   }



    
