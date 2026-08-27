public class Stack{

    LinkedList l1;
     public Stack(){
        l1 = new LinkedList();
     }

     //push method 
     public void push(int value){
        l1.insertinSingleLinkedlist(value, 0);
        System.out.println("Inserted value "+value+" in stack ");
     }

     //is Empty
     public boolean isEmpty(){
      
      return l1.head==null;
     }
//pop
     public int pop(){
      int result = -1;
      if(isEmpty()){{
         System.out.println("Stack is empty");
         return result;
      }
      }
      else{
         result = l1.head.value;
        l1.deleteInSingleLinkedList(0);
        return result;
      
      }
     }
//peek
     public int peek(){
      if(isEmpty()){
         System.out.println("empty");
         return -1;
      }
      else{
      return l1.head.value;}
     }
     //DELETE THE STACK
public void delete(){
   l1.head=null;
   
}

      
}