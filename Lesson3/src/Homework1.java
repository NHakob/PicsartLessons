public class Homework1 {
    public static void main(String[] args) {
        {
            System.out.println("Task 1: Create an array and fill it with 2 number");
            int[] arr = new int[2];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
        }

        {
            System.out.println("Task 2: Create an array and fill it with numbers from 1:1000");
            int[] arr = new int[1000];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
        }

        {
            System.out.println("Task 3: Create an array and fill it with odd numbers from -20:20");
            int[] arr = new int[20];

            for (int i = 0, j = -19; i < arr.length; i++, j+=2) {
                arr[i] = j;
            }
        }
    }
}
