import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Stack");
        Stack s = new Stack(10);

        s.push(10);
        s.push(20);
        s.push(120);
        s.push(120);
//        s.push(120);
//        s.push(101);
        s.pop();
        s.pop();
       // s.pop();
       // s.pop();
      //  s.pop();

    }
}