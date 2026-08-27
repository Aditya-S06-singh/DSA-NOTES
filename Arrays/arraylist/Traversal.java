
    
import java.util.ArrayList;
import java.util.Iterator;
class Traversal {
          public static void Traversal(ArrayList<Integer> name){
              for (int i = 0; i < name.size() ; i++) {
                  int number =name.get(i);
                  System.out.println(number);
              }}
public static void TraversalByIterator(ArrayList<Integer> name){
              Iterator<Integer> it = name.iterator();
      while (it.hasNext()){
          int number = it.next();
          System.out.println(number);
      }
          }
  public static void TraversalByFOREACHLOOP(ArrayList<Integer> name){
    for(int name1:name){
        System.out.println(name1);
    }
  }        
      

      
}
