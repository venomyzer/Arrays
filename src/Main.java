import java.util.Arrays;
import java.util.Scanner;

class Arrayz {

    static int removeDuplicates(int[] arr, int n) {

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                arr[i+1] = arr[j];
                i++;
            }
        }

        return i+1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int []arr = new int [n];

        System.out.println("Enter the elements ascending order including duplicates: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int size = removeDuplicates(arr, n);
        System.out.println("The number of unique elements in the array is: "+size);
        System.out.println("The array with removed duplicates is: "+Arrays.toString(Arrays.copyOf(arr, size)));

    }

}