public class FixedStack implements Stack{

    int sizes = STACK_SIZE, top = 0;
    int[] stack = new int[STACK_SIZE];




   public void pop () {
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

   public void push ( int num){
        System.out.println("IN Push");
        stack[top] = num;
        top++;
//        System.out.println("The New Stack is: ");
//        display();
    }

    void display () {
        for (int i : stack) {
            System.out.println(i);
        }

    }
}
