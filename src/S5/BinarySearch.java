package S5;


// 16-> 8-> 4->2->1

//  2^k = n -> number
//  k - no of comparisons

// k = logn base 2

// problem statement
// input output example

// constraints
// -10^6 < arr[i] < 10^40
// -10 < tagget < 10

// to choose the right datatype

// -------------------------------------> huge
// 0                l               r   398495845645-> largest integer
public class BinarySearch {
    //  0   1   2   3   4   5  6 7
    // {10, 20, 30, 40, 50,60,70,80};
    //                     r   l
    //
// 65 -> 6
    //  just lesser element -> + 1


    // 1--1
    //      m

    // given a sorted array of distinct integers - return index of target
    // if it id notfound, then u return the inde where it should be inseted to keep it sorrted

    // 1 + 1  + 1 + 1 + 1 + 1 + 1
    public static int binarySearch(int arr[], int target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;//3 // safe formula

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] < target){
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,60,70};
        int target = 65;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }
}
