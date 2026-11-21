package S4;

import java.util.Arrays;

// Bubble , Selection, Insertion - O(n^2)
// merge sort, quick sort, heap sort - nlogn
public class BubbleSort {

    public static void bubbleSort(int arr[]){
        int n = arr.length; //5

        for(int i=0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // n = 5
    // 0 1 2 3 4
    // 2,3,4,5,8
    //   i
    // j


    static void main() {
        int arr[] = {5,3,8,4,2};

        for(int i=0;i<5;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Arrays.sort(arr);

        bubbleSort(arr);
        for(int i=0;i<5;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
