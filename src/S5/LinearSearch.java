package S5;

public class LinearSearch {

    // 100 -> 100
    public static int linearSearch(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // mush faster - logn
    // log 100 -> 7
    // search space must be sorted


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 40;
        int result = linearSearch(arr, target);
        System.out.println(result);

//        int result1 = binarySearch(arr, target);
//        System.out.println(result1);
    }
}
