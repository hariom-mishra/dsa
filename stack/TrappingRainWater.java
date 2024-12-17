package stack;

public class TrappingRainWater {
    static int findArea(int[] ar){
        int[] nextAr = new int[ar.length];
        int[] prevAr = new int[ar.length];

        int maxNext = 0;
        int  maxPrev = 0;

        int i = 0;
        //find minAr
        while (i < ar.length) {
          if(maxPrev < ar[i]){
            prevAr[i] = maxPrev;
            maxPrev = ar[i];
          }else{
            prevAr[i] = maxPrev;
          }
          i++;
        }

        i = ar.length - 1;
        //find maxAr
        while (i >= 0) {
            if(maxNext < ar[i]){
                nextAr[i] = maxNext;
                maxNext = ar[i];
            }else{
                nextAr[i] = maxNext;
            }
            i--;
        }

        i = 0;
        int arSum = 0;
        while (i < ar.length - 1) {
            int height = Math.min(nextAr[i], prevAr[i]) - ar[i];
            if(height > 0){
                arSum += height;
            }
            i++;  
        }

        return arSum;
    }

    public static void main(String[] args) {
        int[] ar = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(findArea(ar));
    }
}
