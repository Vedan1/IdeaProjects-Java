import java.lang.reflect.Array;
import java.util.Arrays;

public class CommonElementsinArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,9,4,5};
        int[] arr2 = {5,6,7,8,9};

        int maxSize = Math.min(arr1.length,arr2.length);
        int[] resArray = new int[maxSize];
//        System.out.println(maxSize);
        int resultIndex =0;

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    resArray[resultIndex]=arr1[i];
                    resultIndex++;

                }
            }
        }

        System.out.println("Common elements: ");

        for(int k=0;k<resultIndex;k++){
            System.out.print(resArray[k]+" ");
        }



        /*int[] arr1 = {1,4,2,3,56,7,8,7,8,7,8};
        int counter = 0;

        int[] arr2 = {1,22,67,22,99,7,56,3,2};
        int[] tempArr = new int[arr1.length];
        for (int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    boolean flag=true;
                    for(int x : tempArr){
                        if (x==arr1[i]){
                            System.out.println(x);
                            flag=false;
                            break;
                        }
                    }
                    if(flag==true){
                    tempArr[counter] = arr1[i];
                    counter++;}
                    System.out.println(Arrays.toString(tempArr));
                    break;
                }
            }

        }
        //Arrays.sort(tempArr);
        System.out.println(Arrays.toString(tempArr));*/

    }

}
