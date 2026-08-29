public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k=3;
        int[] arr = new int[nums.length];
        

          CircularQueue queue = new CircularQueue(nums.length);

        for(int i =nums.length-1;i>=0;i--){
            
            queue.enque(nums[i]);
            System.out.println(queue);
        }
        for(int i =0;i<k;i++){
            queue.enque(queue.deQueue());
        }
        for(int i =0;i<nums.length;i++){
            arr[i]=queue.deQueue();
        }
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]);

        }

    }
}