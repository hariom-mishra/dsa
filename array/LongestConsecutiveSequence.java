import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    static int findLength(int[] ar){
        Set<Integer> set = new HashSet<>();
        int ans = 0;

        for(int i = 0; i < ar.length; i++)
            set.add(ar[i]);

        for(int i = 0; i< ar.length; i++)
            if(!set.contains(ar[i]-1)){
                int j = ar[i];
                while (set.contains(j)) {
                    j++;
                }

                if(ans < j - ar[i])
                    ans = j - ar[i];
            }
        return ans;
    }

    public static void main(String[] args) {
        int[] ar  = { 1, 9, 3, 10, 4, 20, 2 };
        System.out.println(findLength(ar));
    }
}
