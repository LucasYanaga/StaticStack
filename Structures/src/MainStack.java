public class MainStack {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(8);
        stack.push(3);
        stack.push(4);

        stack.printStack();

        stack.push(9);
        stack.push(1);
        //Não vai adicionar
        stack.push(11);

        stack.printStack();

        System.out.println("isFull? " + stack.isFull());
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("Peek? " + stack.peek());

        stack.pop();
        stack.pop();

        stack.printStack();

        System.out.println("isFull? " + stack.isFull());
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("Peek? " + stack.peek());
    }
}
