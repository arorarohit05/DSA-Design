import java.util.Scanner;

public class LargestElemnent {

    // 56 78 89 23 45 1 6 7 9 8

    // Return the largest element in the whole array
    public static int findLargest(int arr[]){
        // assumes first element is largesrt
        int max = arr[0];

        // traverse the remaining elements
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // return
        return max;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findLargest(arr));
    }
}
