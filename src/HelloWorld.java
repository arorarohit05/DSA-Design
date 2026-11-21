import java.util.Scanner;

public class HelloWorld {

    static void main() {
        int a =5; //
        System.out.println(a);
        //           0   1   2   3
        // inititlizatio and adding elements
        int[] arr = {2 , 7 , 90, 45}; // hardcoding

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//7

        // inititlized a array od size n
        int[] brr = new int[n];

        // brr -> [0,0,0,0,0,0,0]
        //         0 1 2 3 4 5 6

        for(int i=0;i<n;i++){
            brr[i] = sc.nextInt();
        }

        System.out.println("BRR-> "+ brr[3]);

        for(int i=0;i<n;i++){
            System.out.println("BRR->"+brr[i]);
        }


        //
        //    refrecene to base addred

        // access
        System.out.println(arr[2]);// accessing element TC -> O(1)
        System.out.println("Hello World");

        // n elements
        // 0 1 2 3
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }

     //   System.out.println(arr[4]);
    }
}


// Q -> find largest elements in the array

// references
