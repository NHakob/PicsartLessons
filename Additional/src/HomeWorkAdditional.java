import java.util.Arrays;

public class HomeWorkAdditional {
    public static void main(String[] args) {
        int[] arr1 = {4, 1, 2, 2, 1, 4, 4, 5, 5};
        int res = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            res ^= arr1[i];
        }

        System.out.println(res + " had no pair");

        int[] arr = {4, 1, 2, 2, 1, 4, 4, 5, 5, 7, 7, 7, 8, 8, 9};
        int count = 0;

        Arrays.sort(arr);

        int bucket = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == bucket) {
                count++;
            } else {
                if (count % 2 == 1) {
                    System.out.printf("%d had no pair\n", bucket);
                }
                count = 1;
                bucket = arr[i];
            }

            if (i == arr.length - 1) {
                if (count % 2 == 1) {
                    System.out.printf("%d had no pair\n", bucket);
                }
            }
        }
    }
}

