import java.util.Scanner;

class Arrayz {

    static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();

        int index = linearSearch(arr, key);

        if (index == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index: " + index);
        }

    }

}