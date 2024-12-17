public class FindDuplicate {
    static int findDuplicateElement(int[] ar){
        int slow = ar[0];
        int fast = ar[slow];
        while (slow != fast) {
            slow = ar[slow];
            fast = ar[ar[fast]];
        }
        fast = ar[0];

        while (slow!=fast) {
            slow = ar[slow];
            fast = ar[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] nums= {1, 2, 3, 4, 4, 5};
        System.out.println(findDuplicateElement(nums));
    }
}
