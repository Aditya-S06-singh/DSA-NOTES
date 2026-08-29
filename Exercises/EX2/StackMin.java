public class StackMin{
       Node top;
       Node min;

  

  public StackMin() {
    // TODO]
    top=null;
    min=null;
    
  }

  public int min() {
    // TODO
    return min.value; 
  }

  public void push(int value) {
    // TODO
    if(min==null){
      min = new Node(value,min);
    }else if(min.value < value){
      min = new Node(min.value,min);
    }else{
      min = new Node (value,min);
    }
    top=new Node(value,top);
  }

  public int pop() {
    // TODO
    min =min.next;
    int result= top.value;
    top=top.next;
    return result;
  }
}