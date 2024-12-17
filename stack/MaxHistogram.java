package stack;

public class MaxHistogram {
    static int findMax(int[] ar){
        int[] prevSm = PreviousSmall.getPrev(ar);
        int[] nextSm = NextSmaller.findNext(ar);
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < ar.length; i++){
            int area = ar[i] * (nextSm[i] - prevSm[i] -1);
            max = Math.max(area, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] ar = {4, 5, 2, 10, 8};
        System.out.println(findMax(ar));
    }
}
