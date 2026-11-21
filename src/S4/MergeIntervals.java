package S4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//  collections in java
// STL


//              =
//
//                 {1,3},
//                {2,6}
//                  {5,18},
 //                {8,10},
//


//            {1,3},
public class MergeIntervals {

    public static int[][] mergeIntervals(int[][] intervals){
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));// sort by data using 0th index

        List<int[]> result= new ArrayList<>(); // dynamic array - keep adding rows - array

        for(int[] interval: intervals){
            if(result.isEmpty()){
                result.add(interval);
            }
            else{ // compare with prev result
                int[] last = result.get(result.size()-1); // [1,3]
                if(interval[0] <= last[1]){
                    last[1] = Math.max(last[1],interval[1]);
                }
                else{
                    result.add(interval);
                }
            }
        }

        // result
        return result.toArray(new int[result.size()][]);
    }

    static void main() {
        int[][] intervals = {
                {8,10},
                {1,3},
                {5,18},
                {2,6}
        };

        int[][] result = mergeIntervals(intervals);

        for(int i = 0;i<result.length;i++){
            for(int j=0;j<=1;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}



//[
//
//    [8, 10],
//
//    [1, 3],
//
//    [15, 18],
//
//    [2, 6]
//
//]

//  1 3 4 5