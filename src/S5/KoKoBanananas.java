package S5;

public class KoKoBanananas {

// BINARY SEARCH ON ANSWERs===
    //bananans - {3,7,11,6};


    //  4 5
    // r l r
    //  m
    // 3
    public static int minEatingSpeed(int[] piles, int hours){
        if(hours<piles.length){
            return -1;
        }

        int left = 1;
        int right = 0;
        for(int pile:piles){
            right = Math.max(right,pile); // max
        }

        int answer = right;

        while(left<=right){
            int mid  = left+(right-left)/2;

            if(canFinish(piles,hours,mid)){
                answer = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return answer;
    }

    // {3,6,7,11};  // speed
    //  1 1 2 2

    // speed = 6
    public static boolean canFinish(int[] piles, int hours, int speed){
        int h = 0;
        for(int pile:piles){
            if(pile%speed == 0){
                h = h + pile/speed;
            }
            else{
                h =  h + pile/speed + 1;
            }
        }

        // hours = 8
        // h =12
        return h<=hours;
    }

    static void main() {
        int[] piles = {3,6,7,11};
        int hours = 8;
        System.out.println(minEatingSpeed(piles, hours));
    }
}
