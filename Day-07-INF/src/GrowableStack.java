public class GrowableStack implements Stack{

    int sizes=STACK_SIZE, top = 0;
    int[] dstack = new int[sizes];  
    @Override
    public void pop() {
        top--;
        int temp = dstack[top];                                   
        dstack[top]= 0;
        System.out.println("The Popped Element is: "+temp);
        display();

    }
    void peek(){
        System.out.println("The Top Element is "+ dstack[top-1]);  

    }
    Boolean isEmpty(){
        if(top<=0){
            return true;                                            
        }
        return false;
    }
    @Override
    public  void push(int num){
        if(top==sizes){                                             
            
            expandArr();
        }
        dstack[top] = num;                                          
        top++;                                                      
//        System.out.println("The New Stack is: ");
//        display();
    }
    void expandArr(){
        System.out.println("inExpandArr");
        int[] newStack = new int[sizes*=2];
        for(int i=0;i<dstack.length;i++){
            System.out.println("copiying");
            newStack[i] = dstack[i];
            
        }
        dstack=newStack;


    }
    void display () {
        for (int i : dstack) {
            System.out.println(i);
        }

    }
}
