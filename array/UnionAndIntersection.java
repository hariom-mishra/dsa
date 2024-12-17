import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//condition is that the list is sorted
public class UnionAndIntersection {
    static int[] union(int[] a, int[] b){
        int i = 0;
        int j = 0;
        List<Integer> lst = new LinkedList<>();
       while (i != a.length && j != b.length) {
            if(a[i] == b[j]){
                lst.add(a[i]);
                i++;
                j++;
            }else if(a[i] < b[j]){
                lst.add(a[i]);
                i++;
            }else{
                lst.add(b[j]);
                j++;
            }
       }

       if(i != a.length){
        while (i < a.length) {
            lst.add(a[i]);
            i++;
        }
       }

       if(j != b.length){
        while (j < b.length) {
            lst.add(b[j]);
            j++;
        }
       }

       int[] res = new int[lst.size()];
       int pos = 0;
       for(int num: lst){
        res[pos++] = num;
       }
       return res;
    }

    static int[] intersection(int[] a, int[] b){
        int i = 0, j = 0;
        List<Integer> lst = new LinkedList<>();
        while (i < a.length && j < b.length) {
            if(a[i] == b[j]){
                lst.add(a[i]);
                i++;
                j++;
            }else if(a[i] < b[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] res = new int[lst.size()];
        int pos = 0;
        for(int num: lst){
            res[pos++] = num;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,3,3,4,4,4,5,7};
        int[] b = {1,3,3,3,5,5,5,6,8,9};

        System.out.println(Arrays.toString(union(a, b)));
        System.out.println(Arrays.toString(intersection(a, b)));
    }
}
