
public class NumberOfBitsToChangeFromAToB {
    static int fun(int A, int B){
        int res = A ^ B;
        int count = countOneInBinary(res);
        return count;
    }

    static int countOneInBinary(int num){
        int count = 0;
        while (num != 0) {
            count++;
            num = num & num -1;
        }
        return count;
    }

    public static void main(String[] args) {
        int A = 5;
        int B = 3;
        System.out.println(fun(A, B));
    }
}