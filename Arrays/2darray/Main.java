import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        int[][] int2Darray = new int[2][2];
        int2Darray[0][1]=2;
        int2Darray[1][0]=1;
        insertion.insertionin2darray(int2Darray, 1, 1, 2);

        System.out.println(Arrays.deepToString(int2Darray));
        accessing.accessingin2Darray(int2Darray, 1,1);
        traversal.traversing(int2Darray);
        searching.searchingof1element(int2Darray, 2);

    }
}