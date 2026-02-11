import java.util.Arrays;
import java.util.Scanner;

class Arrayz {

    static void zeroesToEnd(int [] arr, int n) {

        int j = -1, temp = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }
        if(j == -1) {
            return;
        }

        for(int i = j+1; i < n; i++) {
            if(arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
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

        zeroesToEnd(arr, n);
        System.out.println("The updated elements in the array are: "+ Arrays.toString(arr));

    }

}