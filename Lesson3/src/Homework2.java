public class Homework2 {
    public static void main(String[] args) {
        {
            System.out.println("Task 4: Create an array and fill it. Print all elements which can be divided by 5.");
            int[] arr = new int[26];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] % 5 == 0 ? arr[i] + " " : "");
            }
        }

        {
            System.out.println("Task 5: Create an array and fill it. Print all elements which are between 24.12 and 467.23.");
            double[] arr = new double[26];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = 20.0 * i + i / 10.0 + i / 100.0;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] >= 24.12 && arr[i] <= 467.23 ? arr[i] + " " : "");
            }
        }

        {
            System.out.println("Task 6: Create an array and fill it. Print count of elements which can be divided by 2");
            int[] arr = new int[26];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }

            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count++;
                }
            }

            System.out.printf("There are %d lemeents which are divided by 2\n", count);
        }
    }
}
