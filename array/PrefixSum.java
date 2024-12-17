import java.util.HashMap;
import java.util.Map;

public class PrefixSum {
    static int findCount(int[] ar){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            if(sum == 0 || map.containsKey(sum)){
                count++;
            }
        }
        return count;
    }

    static int findLogestSubarray(int[] ar){
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
            map.putIfAbsent(sum, i);
            if(map.containsKey(sum)){
                max = Math.max(i - map.get(sum), max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ar = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        System.out.println(findCount(ar));
        System.out.println(findLogestSubarray(ar));
    }
}
