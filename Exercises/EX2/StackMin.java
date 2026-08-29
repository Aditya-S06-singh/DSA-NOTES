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
    /*
 * This method pushes the given value onto the main stack and updates the
 * minimum-tracking stack at the same time. The min stack stores the smallest
 * value present at each level of the main stack. If the stack is empty, the
 * first value becomes the minimum. Otherwise, if the current minimum is
 * smaller than the new value, the current minimum is copied again; if the new
 * value is smaller than or equal to the current minimum, the new value becomes
 * the minimum. This lets us get the minimum value in O(1) time using min.value.
 */
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
    /*
 * This method removes and returns the value at the top of the main stack.
 * Since the min stack stores one minimum value for every element in the main
 * stack, its top node must also be removed whenever an element is popped.
 * First, min is moved to its next node to discard the minimum associated with
 * the removed value. Then, the current top value is saved, top moves to the
 * next node, and the saved value is returned.
 */
    // TODO
    min =min.next;
    int result= top.value;
    top=top.next;
    return result;
  }
}