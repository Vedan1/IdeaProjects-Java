import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Linear Search! ");
        int[] arr = {2,3,55,2,14,23,5,89,4465,6,4};
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int n = sc.nextInt();
        for(int i: arr){
            if(i==n){
                System.out.println("Match Found");
                flag = true;
            }
        }
        if(flag==false) System.out.println("No Match Found");



    }
}