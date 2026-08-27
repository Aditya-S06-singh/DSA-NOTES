public class searching{
    public static void searchingof1element(int arr[][], int value) {
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==value){
                    System.out.println("FOUND at: "+i+j);
                }
            }}
    }
}