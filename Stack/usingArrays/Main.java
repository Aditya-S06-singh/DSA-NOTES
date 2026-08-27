
public class Main{
    public static void main(String[] args) {
        Stack newstack = new Stack(4);
        newstack.push(5);
        newstack.push(7);
        newstack.pop();
        newstack.peek();
        newstack.pop();
        newstack.peek();
        
        newstack.delete();

        
    }
}