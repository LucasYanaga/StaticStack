public class Stack {
    public int[] stack;
    public int index;


    public Stack(int lenght){
        this.index = -1;
        this.stack = new int[lenght];
    }

    public Stack(int[] stack) {
        this.index = -1;
        this.stack = stack;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public void push(int value){
        System.out.println("Pushing: " + value);

        if(!this.isFull()){
            this.stack[++this.index] = value;
        }else{
            System.out.println("Stack is full!");
        }
    }

    public void pop(){
        if(!this.isEmpty()){
            System.out.println("Poping: " + this.stack[this.index]);
            this.stack[this.index] = 0;
            this.index--;
        }
    }

    public int peek(){
        if(!this.isEmpty()){
            return this.stack[this.index];
        }else{
            return -1;
        }
    }

    public boolean isEmpty(){
        boolean isEmpty = false;

        if(this.index == -1){
            isEmpty = true;
        }
        return isEmpty;
    }

    public boolean isFull(){
        boolean isFull = false;

        if(this.index + 1 == this.stack.length){
            isFull = true;
        }
        return isFull;
    }

    public void printStack(){
        for (int i = this.stack.length -1; i >= 0; i--) {
            System.out.println("| " + this.stack[i]+ " |");
        }
        System.out.println("-----");
    }
}
