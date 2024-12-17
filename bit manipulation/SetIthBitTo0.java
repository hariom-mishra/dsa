public class SetIthBitTo0 {
    static int setBit(int num, int i){
        int mask = ~(1<<i);
        return num & mask;
    }
    public static void main(String[] args) {
        int num = 5;
        System.err.println(setBit(num, 0));
    }
}
