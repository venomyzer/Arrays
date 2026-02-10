import java.util.Scanner;

class Arrayz {

    static boolean isSorted(int [] arr) {

        int n = 0;
        int c = arr[0];

        if(arr[0] <= arr[1]){
            for (int i = 0; i < arr.length; i++) {
                if (c <= arr[i]) {
                    c=arr[i];
                    n++;
                }
            }
            if(n == arr.length){
                return true;
            }
            else {
                return false;
            }
        } else if (arr[0] >= arr[1]) {
            for (int i = 0; i < arr.length; i++) {
                if (c >= arr[i]) {
                    c=arr[i];
                    n++;
                }
            }
            if(n == arr.length){
                return true;
            }
            else {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean b = isSorted(arr);
        System.out.println("Array Sorted? "+b);

    }

}