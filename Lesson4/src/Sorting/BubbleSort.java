package Sorting;

/*
 * Will srt array in decreasing order
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 9, 5, 4,3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
