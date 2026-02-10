import java.util.Arrays;
import java.util.Scanner;

class Arrayz {

    static void leftRotate(int[] arr, int n) {

        int [] temp = new int[n];
        for (int i = 0; i < n-1; i++) {
            temp[i] = arr[i+1];
        }
        temp[n-1] = arr[0];
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        leftRotate(arr, n);

        System.out.println("Rotated array is: ");
        System.out.println(Arrays.toString(arr));

    }

}