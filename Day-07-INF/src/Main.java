import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("Hello world!");
        // System.out.println("Hello world!");
        boolean flag = true;
        FixedStack fs = new FixedStack();
      GrowableStack gs = new GrowableStack();

        System.out.println(fs);
        System.out.println(gs);

      while(flag){
          System.out.println("Enter Your Choice: ");
          System.out.println("1. Enter Into Static Array\t 2. Enter Into Dynamic Array ");
          System.out.println("3. Print Static Array\t 4. Print Dynamic Array ");
          System.out.println("5. Exit ");
          try {

              switch (sc.nextInt()) {
                  case 1:
                      System.out.println("Enter Value Upto 5");
                      fs.push(sc.nextInt());
                      break;
                  case 2:
                      System.out.println("Enter Value");
                      gs.push(sc.nextInt());
                      break;
                  case 3:
                      System.out.println("The Stack is: ");
                      fs.display();
                      break;
                  case 4:
                      System.out.println("The Stack is: ");
                      gs.display();
                      break;
                  case 5:
                      flag = false;
                      break;

                  default:
                      System.out.println("Check Your Input");
              }
          } catch(ArrayIndexOutOfBoundsException a){
              System.out.println("The Stack is OverFlowed");

              }


          }
      }



    }

