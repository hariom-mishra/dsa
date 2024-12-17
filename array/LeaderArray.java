public class LeaderArray {
    static int findLeader(int[] ar){
        int prevMax = Integer.MIN_VALUE;
        for(int i = ar.length - 1; i >= 0; i--){
            if(ar[i] > prevMax){
                prevMax = ar[i];
            }
        }
        return prevMax;
    }
    public static void main(String[] args) {
        int[] ar = {1, 3, 7, 2, 5, -1};
        System.out.println(findLeader(ar));
    }
}
