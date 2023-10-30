public class Queue {
    int size;
    int queue[] = new int[5];
    int front;
    int rear;




    public void enqueue(int data){
        queue[rear] = data;
        rear+=1;
        size+=1;

    }
    public int dequeue(){
        int data = queue[front];
        front+=1;
//        size-=1;

        return data;
    }


    public void show(){
        System.out.println("Elements are : ");
        for(int i =front;i<size;i++){
            System.out.print(queue[i]+ "<-");
        }
        System.out.println("front: "+ front + "rear" + rear);
    }

}
