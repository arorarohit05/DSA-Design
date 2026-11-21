import java.util.HashSet;
import java.util.Set;


// GIT ->
// Excel sheet -> questions


//
public class MaxLenfthSubstring {

    public static int maxLengthSubstring(String s) {

        // faster search
        Set<Character> set = new HashSet<>(); // which always store unique element (a,b,c) = c present, b present O(1)

        int left = 0;
        int maxLength = 0;//1

        //"abcabcbb";
        // l
        // r

        // set=[]


        for(int right = 0;right<s.length();right++){
            char current = s.charAt(right);//g

            // shrinking - duplication
            // vh-> g
            // l    r
            while (set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }

            // no duplication
            set.add(current);
            int currentLength = right-left+1; // a substring from left to right having always unique element
            maxLength = Math.max(maxLength,currentLength);
        }

        return maxLength;

    }
    // 0123456789
    //"abccdabcbb"
    //    l  r

    // 6-3+1 = 4

    //
    static void main() {
        String s = "abccdabcbb";
        System.out.println(maxLengthSubstring(s));
    }
}
