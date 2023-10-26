public class DStack {
        int sizes=2, top = 0;     //defaut size is set to 2 [array size ]
        int[] dstack = new int[sizes];  //the primary stack which'll store the data
        void pop () {
            top--;
            int temp = dstack[top];                                   //same as explained in @Stack
            dstack[top]= 0;
            System.out.println("The Popped Element is: "+temp);
            display();

        }
        void peek(){
            System.out.println("The Top Element is "+ dstack[top-1]);  //same as explained in @Stack

        }
        Boolean isEmpty(){
            if(top<=0){
                return true;                                            //same as explained in @Stack
            }
            return false;
        }

        void push ( int num){
//            System.out.println("Top is: " + top);
//            System.out.println("Size is: " + sizes);
            if(top==sizes){                                             //if the top == size means top element is equal to given length
                                                                        //goto expand array method()
                expandArr();
            }
            dstack[top] = num;                                          //rest is same as Stack just replace top element with given number then
            top++;                                                      //increase the top element
            System.out.println("The New Stack is: ");
            display();
        }
        void expandArr(){
            System.out.println("inExpandArr");                       //this is chad func, it creates a new array os sizex2 then
            int[] newStack = new int[sizes*=2];
            for(int i=0;i<dstack.length;i++){                       //copies the dstack data onto newstack data in array format
                System.out.println("copiying");
               newStack[i] = dstack[i];                             //remember to keep length as i<dstack.len cus elements might be
                                                                         //    data = [122 , 123, 124, 125] = 4
            }                                                          //addresing  = [0   , 1  , 2  ,  4 ] = 0-3 keep that in mind
            dstack=newStack;                                //IMP this copies the newStack refrence onto the dstack


        }
        void display () {
            for (int i : dstack) {
                System.out.println(i);
            }

        }

}
