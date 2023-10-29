public class MostOccuranceInArray {
//2.29
    public static void main(String[] args) {

        int[] arr = {1,2,3,1,21,21,2,3,22,2,1,4,3,41,21,2,3,21,21,21};
        int max_occurence = 0;
        int max_occurence_elem = 0;


        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    temp++;
                }
            }
            if(temp>max_occurence){
                max_occurence=temp;
                max_occurence_elem=i;
            }
        }

        System.out.println("Most Occuring Elem: "+arr[max_occurence_elem]);
        System.out.println("No of Times Elem Occured: "+max_occurence);

    }



}
