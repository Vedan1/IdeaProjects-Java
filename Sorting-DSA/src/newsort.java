import java.util.Random;

public class newsort {

        public static void main(String[] args) {
            Random rand = new Random();
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = rand.nextInt(100);
            }

            System.out.println("Before:");
            printArray(numbers);

            quicksort(numbers);

            System.out.println("\nAfter:");
            printArray(numbers);
        }

        private static void quicksort(int[] array) {
            quicksort(array, 0, array.length - 1);
        }

        private static void quicksort(int[] array, int lowIndex, int highIndex) {

            if (lowIndex >= highIndex) {
                return;
            }

            int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
            int pivot = array[pivotIndex];
            swap(array, pivotIndex, highIndex);

            int leftPointer = partition(array, lowIndex, highIndex, pivot);

            quicksort(array, lowIndex, leftPointer - 1);
            quicksort(array, leftPointer + 1, highIndex);

        }

        private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
            int leftPointer = lowIndex;
            int rightPointer = highIndex - 1;

            while (leftPointer < rightPointer) {

                // Walk from the left until we find a number greater than the pivot, or hit the right pointer.
                while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                    leftPointer++;
                }

                // Walk from the right until we find a number less than the pivot, or hit the left pointer.
                while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                    rightPointer--;
                }

                swap(array, leftPointer, rightPointer);
            }

            // This is different from what the video has, and fixes an issue where the last value could potentially be out of order.
            // Thanks to viewer Wilson Barbosa for suggesting the fix!
            if(array[leftPointer] > array[highIndex]) {
                swap(array, leftPointer, highIndex);
            }
            else {
                leftPointer = highIndex;
            }

            return leftPointer;
        }

        private static void swap(int[] array, int index1, int index2) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }

        private static void printArray(int[] numbers) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }

