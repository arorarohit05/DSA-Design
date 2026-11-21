public class MaxSumOfSubarraySizeK {

    // n = 10
    // 0 1 2 3 4     5 6 7 8 9
    //

    // k = 3
    public static int maxSumSizeK(int arr[], int k){
        int currentSum = 0;
        int n = arr.length;
        for(int i=0;i<k;i++){
            currentSum +=arr[i];
        }

        int maxSum = currentSum;

        for(int i=1;i<=n-k;i++){
            currentSum = currentSum + arr[i+k-1] - arr[i-1];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    static void main() {
        int arr[] = {2,1,5,1,3,2};
        int k = 3;

        System.out.println(maxSumSizeK(arr, k));
    }
}
