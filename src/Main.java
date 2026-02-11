import java.util.Arrays;
import java.util.Scanner;

class Arrayz {

    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArray(int[] arr, int k, String direction) {

        int n = arr.length;

        if (k == 0 || n == 0) {
            return;
        }

        k = k % n;

        if (direction.equals("right")) {

            reverseArray(arr, 0, n - 1);
            reverseArray(arr, 0, k-1);
            reverseArray(arr, k, n-1);

        }

        if (direction.equals("left")) {

            reverseArray(arr, 0, k - 1);
            reverseArray(arr, k, n-1);
            reverseArray(arr, 0, n-1);

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int []arr = new int [n];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of places to rotate: ");
        int k = sc.nextInt();
        System.out.println("Enter the direction of the array: ");
        String direction = sc.next().toLowerCase();

        rotateArray(arr, k, direction);

        System.out.println("The rotated array is: " + Arrays.toString(arr));
    }

}