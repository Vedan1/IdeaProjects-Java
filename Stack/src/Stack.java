/*How Did I Do it?
well Stack is ds which works like stacking books you cant remvove bottom onces unless you remove top ones
firstly push statemnt is given, where stack is declared with size as user defined, then top is defined as o
1. data is pushed into stack using stack[top]= num; where num is number and top defines the top value
2. pop does the same just it uses stack[top]=0; where the top element is set to 0 and top -- is done (prior to stack[top]=0) so
    that the top is matching with the view as array has a bit +1 indexing
3. peek is ez, is empty just checks is the top is is 0 then gives is empty true*/


public class Stack {
    public Stack( int i){
        sizes = i;
    }

    int sizes, top = 0;
    int[] stack = new int[6];




        void pop () {
        top--;
        int temp = stack[top];
        stack[top]= 0;
        System.out.println("The Popped Element is: "+temp);
        display();

    }
    void peek(){
        System.out.println("The Top Element is "+ stack[top-1]);

    }
    Boolean isEmpty(){
        if(top<=0){
            return true;
        }
        return false;
    }

        void push ( int num){
        System.out.println("IN Push");
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