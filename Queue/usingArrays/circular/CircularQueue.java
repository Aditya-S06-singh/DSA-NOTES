
public class CircularQueue {

    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public CircularQueue(int n){
        this.arr = new int[n];
        this.topOfQueue=-1;
        this.beginningOfQueue=-1;
    }

    //isFull()

    public boolean isFull(){
    return (topOfQueue+1)%arr.length==beginningOfQueue;
    }

    public boolean isEmpty(){
        return beginningOfQueue==-1;
    }

    //enque
    public void enque(int num){
        if(isFull()){
            System.out.println("IS FULL");
        }
        else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue=0;
            arr[topOfQueue]=num;
            System.out.println("INSERTED :"+num);
        }
        else{
            topOfQueue = (topOfQueue + 1) % arr.length;
            arr[topOfQueue] = num;
            System.out.println("INSERTED :"+num);
            
        }
    }

    //deque
 public int deQueue() {
    
    if (isEmpty()) {
        System.out.println("NUMBER CANT BE REMOVED AS THE QUEUE IS EMPTY");
        return -1;
    }

    int numRemoved = arr[beginningOfQueue];

    if (beginningOfQueue == topOfQueue) {
        beginningOfQueue = -1;
        topOfQueue = -1;
        System.out.println("Last element removed");
    }
    else {
        beginningOfQueue= (beginningOfQueue+1)%arr.length;
    }

    return numRemoved;
}

//peek
public int peek(){
    return beginningOfQueue;
}

public void delete(){
beginningOfQueue=-1;
topOfQueue=-1;
}






}