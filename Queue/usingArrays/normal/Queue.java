public class Queue{
    int[] arr;
    int beginningOfQueue;
    int topOfQueue;

    // creation of queue
    public Queue(int n){
        this.arr= new int[n];
        this.beginningOfQueue=-1;
        this.topOfQueue=-1;
        System.out.println("QUEUE WAS CREATED OF SIZE : "+n);
    }

   //is Full
   public boolean isFull(){
        return topOfQueue==arr.length-1;
   }
   //isEmpty
   public boolean isEmpty(){
    return beginningOfQueue==-1 || beginningOfQueue==arr.length;
   }

   //enQueue
   public void enQueue(int num){
        if (isFull()) {
        System.out.println("QUEUE IS FULL");
        }
        else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            arr[beginningOfQueue]=num;
            System.out.println("INSERTED :"+num);
        }
        else{
             topOfQueue++;
            arr[beginningOfQueue]=num;
            System.out.println("INSERTED :"+num);

        }
    }

    //deQueue

    public int deQueue(){
        int numRemoved;
        if(isEmpty()){
            System.out.println("NUMBER CANT BE REMOVED AS THE QUEUE IS EMPTY");
            return -1;
        }
        else{
            numRemoved = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue==topOfQueue){
                beginningOfQueue=topOfQueue=-1;
                System.out.println("Last element removed");
            }
             return numRemoved;

        }      
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }else{
        int peekingNum = arr[beginningOfQueue];
        System.out.println("Num at top of the queue is :"+peekingNum);
        return peekingNum;
    }}

    //delete
    public void delete(){
        
        topOfQueue=beginningOfQueue=-1;
        System.out.println("QUEUE WAS DELETED");
    }
    


   }
