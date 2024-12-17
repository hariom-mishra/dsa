public class CheckPowerOfTwo {
    static boolean checkIfPowerOfTwo(int num){
        return num > 0 && (num & num -1) == 0; 
    }
    public static void main(String[] args) {
        System.out.println(checkIfPowerOfTwo(0));
    }
}
