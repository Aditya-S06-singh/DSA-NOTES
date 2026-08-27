public class Stack{
    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack=-1;
        System.out.println("Stack is created of size "+size);
     }

     // is EMPTY
     public boolean isEmpty(){
       return topOfStack == -1;
     }

     //is FULL

     public boolean  isFull(){
       return topOfStack == arr.length-1;
     }

     //print value of topOfStack
     public void printvalue(){
        System.out.println(arr[topOfStack]);
     }

     //Push
     public void push(int value){
        if(isFull()){
            System.out.println("Stack is full cant be entered");
        }
        else{
            arr[topOfStack+1]=value;
            topOfStack++;
            System.out.print("value is successfully inserted ");
            printvalue();
        }
     }

     //pop
     public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int topStack = arr[topOfStack];
            topOfStack--;
            System.out.println("Value removed "+topStack);
            
            return topStack;
            
        }
     }
        
        //peek

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty ");
                return -1;
            }
            else{
                System.out.println("TOP of STACK "+arr[topOfStack ]);
                return arr[topOfStack];
            }


        }

        //delete 
        public void delete(){
            arr = null;
            System.out.println("Stack is deleted");
        }
}