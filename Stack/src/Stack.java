public class Stack {


    int size, top = 0;
    int[] stack = new int[5];


    public Stack( int i){
        this.size = i;
    }

        void pop () {
            top--;
        stack[top] = 0;

        System.out.println("The New Stack is: ");
        display();

    }

        void push ( int num){
        stack[top] = num;
        top++;
        System.out.println("The New Stack is: ");
        display();
    }

        void display () {
        for (int i : stack) {
            System.out.println(i);
        }

    }

}