import java.util.HashSet;
import java.util.Set;

public class SubsetArray {

    static boolean checkIfSubarray(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < b.length; i++){
            set.add(b[i]);
        }

        for(int i= 0; i < a.length; i++){
            if(!set.contains(a[i])){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 9};
        int[] b = {1, 2, 3, 4, 5, 7};

        System.out.println(checkIfSubarray(a, b));
    }
}
