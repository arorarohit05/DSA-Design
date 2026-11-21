import java.util.Scanner;


// 1 2 3 4 5 6
//     j i
public class ReverseArray {

    public static void reverseArray(int arr[]){

        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for(int x=0;x<arr.length;x++) {
            System.out.print(arr[x]+" ");
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
    }
}
