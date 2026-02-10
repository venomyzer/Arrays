import java.util.Scanner;

class Arrayz {

     static int secondSmallest(int[] arr, int n) {

        if(n < 2) {
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int second_smallest =  Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] < smallest) {
                second_smallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < second_smallest && arr[i] != smallest) {
                second_smallest = arr[i];
            }
        }

         if(second_smallest == Integer.MAX_VALUE) {
             return arr[0];
         }

        return second_smallest;
    }

     static int secondLargest(int [] arr, int n) {

        if(n < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int second_largest =  Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }

        if(second_largest == Integer.MIN_VALUE) {
            return arr[0];
        }

        return second_largest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int second_smallest = Arrayz.secondSmallest(arr, n);
        int second_largest = Arrayz.secondLargest(arr, n);

        System.out.println("Second Smallest Element: "+second_smallest);
        System.out.println("Second Largest Element: "+second_largest);

    }

}