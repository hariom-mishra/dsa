import java.util.Arrays;

public class NonRepeating {
    static int findNonRepeatingWhereOtherRepeatingTwice(int[] nums){
        return Arrays.stream(nums).reduce(0, (a,b)-> a ^ b);
    }

    static int findNonRepeatingWhereOthersRepeatingThrice(int[] array){
        int[] bitCount = new int[32]; // Array to count bits at each position

        // Count the number of 1s in each bit position
        for (int num : array) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }

        // Calculate the non-repeating number using the bit counts
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bitCount[i] % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 3, 4};
        int[] nums2 = {1, 1, 1, 2, 2, 2, 3, 3, 3, 5, 4, 4, 4};
        System.out.println(findNonRepeatingWhereOtherRepeatingTwice(nums));
        System.out.println(findNonRepeatingWhereOthersRepeatingThrice(nums2));
    }
}
