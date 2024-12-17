import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TripletSum {
    static int[] withAuxilarySpace(int[] ar, int target){
        Arrays.sort(ar);
        int[] res = new int[3];
        for(int i = 0; i < ar.length; i++){
            Set<Integer> set = new HashSet<>();

            for(int j = i+1; j < ar.length; j++){
                if(set.contains(target - (ar[i] + ar[j]))){
                    res[0] = ar[i];
                    res[1] = ar[j];
                    res[2] = target - (ar[i] + ar[j]);
                    return res;
                }else{
                    set.add(ar[j]);
                }
            }
        }
        return new int[]{};
    }
    
    static int[] withoutAuxilarySpace(int[] ar, int target){
        for(int i = 0; i< ar.length; i++){
            int l = i+1;
            int r = ar.length -1;
            while (l < r) {
                if(target == ar[i] + ar[l] + ar[r]){
                    int[] res = {ar[i], ar[l], ar[r]};
                    return res;
                }else if(target > ar[i] + ar[l] + ar[r]){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6, 10, 36, 20};
        System.out.println(Arrays.toString(withAuxilarySpace(ar, 52)));
        System.out.println(Arrays.toString(withoutAuxilarySpace(ar, 52)));
    }
}
