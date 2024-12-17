import java.util.Arrays;

public class MergeTwoArrays {
    static void gapMethod(int[] a, int[] b){
        int gap = (a.length + b.length)/2 + (a.length + b.length) % 2;
        while(gap > 0){
            int i = 0, j = i + gap;
            while (j < a.length + b.length) {
                if(i < a.length && j >= a.length && a[i] > b[j - a.length]){
                    swap(a, b, i, j - a.length);
                }else if(i >= a.length &&  b[i - a.length] > b[j - a.length]){
                    swap(b, b, i - a.length, j - a.length);
                }else if(j < a.length && a[i] > a[j] ){
                    swap(a, a, i, j);
                }
                i++;
                j++;
            }
            if(gap == 1)
                break;
            gap = gap / 2 + gap % 2;
        } 
    }

    static void sortingMethod(int[] a, int[] b){
        int i = a.length - 1;
        int j = 0;
        while(i >= 0 && j < b.length){
            if(a[i] > b[j]){
                swap(a, b, i, j);
            }else{
                break;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

    }

    static void swap(int a[], int b[], int x, int y){
        int temp = a[x];
        a[x] = b[y];
        b[y] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8, 9};

        // sortingMethod(a, b);
        gapMethod(a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
