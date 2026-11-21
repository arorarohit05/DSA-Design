import java.util.Arrays;
import java.util.Scanner;

public class TwoNumbersSumK {

    static class Pair{
        int a;
        int b;
    }

    public static Pair twoNumberSumk(int arr[], int k){
        int i = 0;
        int j = arr.length-1;

        Pair obj = new Pair();
        obj.a=-1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum == k){
                obj.a = i;
                obj.b = j;
                return obj;
            }
            else if(sum < k){
                i++;
            }
            else{
                j--;
            }
        }

        return obj;
    }

    // i             j
    // sum < k

    // 46 < 85

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Pair obj = twoNumberSumk(arr , k);

        if(obj.a == -1){
            System.out.println("No pair exist");
            return;
        }
        System.out.println(arr[obj.a]);
        System.out.println(arr[obj.b]);
    }
}
