import java.util.ArrayList;


class SearchinginARRAY{
    
    public static void FOREACHLOOP(ArrayList<Integer> name){
        for(int name1 : name){
            if(name1 == 5){
                System.out.println("Found");
                break;
            }
        }}            


    public static void SearhcingbyIndex(ArrayList<Integer> name){
        int index =name.indexOf(4);
        System.out.println("Found at index: "+index);
    }
}

