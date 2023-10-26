import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Stack");
//        Stack s = new Stack(10);
        DStack s = new DStack();

        System.out.println("Stack Status is: "+s.isEmpty());
        System.out.println(s.sizes);

        try {
            s.push(10);
            s.push(20);
            s.push(120);
//            s.peek();
            s.push(120);
            s.push(121);
            s.push(122);
            s.push(123);
            s.push(124);
            s.push(125);
            s.push(126);
            s.push(127);
            s.push(128);

            System.out.println("Stack Status is: " + s.isEmpty());
            s.peek();
            //  s.pop();
        }catch (ArrayIndexOutOfBoundsException a){
            if(s.top<0){
                System.out.println("Stack Underflow");
            }
            else System.out.println("Stack Overflow");
        }
        finally {
//            Thread.sleep(500);
            System.out.println("Exiting...");
        }
    }
}
///Doubt 1 : in Stack Why doesn't Giving Input Works....