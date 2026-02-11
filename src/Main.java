import java.util.Arrays;
import java.util.Scanner;

class Arrayz {

    static int missingNumber(int[] arr, int n) {

        int actualSum = 0, expectedSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }
        for (int i = 1; i <= n+1; i++) {
            expectedSum += i;
        }

        return (expectedSum-actualSum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int []arr = new int [n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = missingNumber(arr, n);
        System.out.println("The missing number is: "+missing);

    }

}