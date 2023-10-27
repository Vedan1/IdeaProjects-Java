import java.sql.Array;

public class Arr {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};//integerArray
        String[] Str = {"hi","Hello","HowRU?","OkEnd!"};

        System.out.println("PRINTING ARRAY ELEMENTS");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        System.out.println("PRINTING ARRAY Enhanced FLopp ELEMENTS");
        for(int f : arr){
            System.out.print(f+"\t");
        }

        System.out.println();
        System.out.println("PRINTING STRING ELEMENTS");
        for(int i =0;i<Str.length;i++){
            System.out.print(Str[i]+"\t");
        }
        System.out.println();
        System.out.println("PRINTING String Enhanced FLopp ELEMENTS");
        for(String f : Str){
            System.out.print(f+"\t");
        }
    }
}