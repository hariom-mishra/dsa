public class Msb {
    static int rightMostNonZero(int number){
        if (number == 0) {
            return -1; // MSB doesn't exist for 0
        }

        int msbPosition = 0;
        while (number != 0) {
            number = number >> 1;
            msbPosition++;
        }
        return msbPosition - 1;
    }
    public static void main(String[] args) {
        System.out.println(rightMostNonZero(5));
    }
}
