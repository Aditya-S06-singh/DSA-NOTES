public class Main {

    public static void main(String[] args) {
        StackMin stack =new StackMin();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        System.out.println(stack.min());
    }
}