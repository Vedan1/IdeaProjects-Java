import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {0,11,22,33,44,55,66,77,88,99};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Element to Be Searched: ");
        int num=sc.nextInt();
        int e = binaryIterativeSearch(arr,num);
        System.out.println("Element found: " + e );




    }

    public void forLoop(int[] arr){
        System.out.println("For Loop Called");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static int binaryIterativeSearch(int[] arr, int element){
        int high = arr.length-1;
        int mid, low = 0;
        while(low<=high){
            mid = low + ((high-low)/2);
            if(arr[mid]==element){
                return mid;
            }
            else if(mid>element){
                high=mid-1;
            }
            else low=mid+1;
        }
        return -1;
        }

    public void forEachLoop(int[] arr){
        System.out.println("For Each Loop Called");
        for(int i: arr){
            System.out.print(i+" . ");
        }
    }


}