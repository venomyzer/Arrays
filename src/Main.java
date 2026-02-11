import java.util.Scanner;

class Arrayz {

    static int maxConsecutiveOnes(int [] arr, int n) {

        int streak = 0, count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > streak) {
                    streak = count;
                }
            }
            else {
                count = 0;
            }
        }

        return streak;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int []arr = new int [n];

        System.out.println("Enter the elements in the array (zeroes and ones): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int streak = maxConsecutiveOnes(arr, n);
        System.out.println("Maximum consecutive ones are: "+streak);

    }

}