import java.util.Scanner;

class Arrayz {

    public static int Largest(int[] arr, int max) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max;
        int []arr = new int [10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        max = Largest(arr, max);
        System.out.println("Largest Number in Array: "+max);

    }

}