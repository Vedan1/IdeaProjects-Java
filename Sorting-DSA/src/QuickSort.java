import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {

        System.out.println("Welcome to QuickSort: ");
        Random rand = new Random();
        int[] arr = new int[25];
        for(int i = 0;i<arr.length;i++){
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Array Prior is: "+Arrays.toString(arr));
        quickSort(arr,0, arr.length-1);
        System.out.println("Array after is: "+Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int lowIndex, int highIndex ){
        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex-1;
        if(leftPointer>=rightPointer){
            return;
        }
        while(leftPointer<rightPointer){
            while(arr[leftPointer]<pivot&&leftPointer<rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer]>pivot&&leftPointer<rightPointer) {
                rightPointer--;
            }

            swap(arr,leftPointer,rightPointer);
        }
        swap(arr,leftPointer,highIndex);

        quickSort(arr,lowIndex,leftPointer-1);
        quickSort(arr,leftPointer+1,highIndex);


    }
    public  static void swap(int[] array, int index1 , int index2){
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}