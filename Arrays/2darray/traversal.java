public class traversal{
    public static void traversing(int arr[][]){
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr1[j] + " ");
            }
            System.err.println();
        }

    }
}