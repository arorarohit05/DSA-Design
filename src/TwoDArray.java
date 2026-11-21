import java.util.Scanner;

public class TwoDArray {


    static void main() {
        int[][] crr =  {{4,5,6},
                        {4,5,6},
                        {4,5,6},};// hardcoding

    int[] arr = new int[5];
        // [ , , , , ]
        //  0 1 2 3 4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] brr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                brr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }

        // n times
        // size m -> 1 d array



        brr[2][3] = 98;
        System.out.println(brr[2][3]);
        // rows and columns
        // 3 4
        //  0 1 2 3
        // 0[ , , , ]
        // 1[ , , , ]
        // 2[ , , ,98]
        // list of list
    }
}
