public class FindMissingElement {
    static int findDuplicates(int ar[], int n){
        int arraySum = 0;
        int actualSum = n * (n +1)/2;
        for(int i = 0; i < ar.length -1; i++){
            arraySum += ar[i];
        }
        return actualSum -arraySum;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 6, 7, 8};
        System.out.println(findDuplicates(ar, ar.length));
        
    }
}
