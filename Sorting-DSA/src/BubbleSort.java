import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {


        System.out.println("Welcome to BubbleSort: ");
        int arr[] = {1,44,3321,2,10};
        for(int i:BubbleSorts(arr)){
            System.out.print(i +" ");
        }
     //   System.out.println("The Sorted Array  is: "+ str);
    }


    public static int[] BubbleSorts(int[] arr){
        System.out.println("The Array is : "+Arrays.toString(arr));
        int temp;
        for(int x=0;x<arr.length;x++){    //0 1 2 33  221 5 44
            for(int i =0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]) {
                    temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    System.out.println("BubbleSort in"+ arr[i]+" "+arr[i+1]);
                }
            }
        }

        return arr;
    }

}