import java.util.ArrayList;
import java.util.Arrays;


public class arraylist {
    public static void main(String args[]){
        
        ArrayList<Integer> name = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        name.add(7);
        name.add(8);
        name.add(2,10);
   
    Traversal.Traversal(name);
    Traversal.TraversalByIterator(name);
    SearchinginARRAY.FOREACHLOOP(name);
    SearchinginARRAY.SearhcingbyIndex(name);
    name.remove(0);
    System.out.println("After removing the first element: "+name);
    }
}
