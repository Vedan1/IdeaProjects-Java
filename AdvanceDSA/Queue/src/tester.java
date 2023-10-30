
public class tester {

    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue();

        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.enqueue(25);

        q.show();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
              q.enqueue(21);
        q.enqueue(22);
        q.show();


    }
}