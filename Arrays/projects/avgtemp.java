public class avgtemp{
    
    public static int AvgTemp(int[] arr){
        int avg=0;
        for (int i = 0; i < arr.length; i++) {
            avg = avg +(arr[i]) ;
        }
        return avg/arr.length;
    }
    public static void main(String[] args) 
    {
        int[] avg ={1,2,3,4};
       
        System.out.println(AvgTemp(avg));
    }
   
}
    
