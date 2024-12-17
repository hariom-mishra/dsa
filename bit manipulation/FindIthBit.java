class FindIthBit{
    static int returnIthBit(int num, int i){
        return (num>>i) & 1;
    }
    public static void main(String[] args) {
        System.out.println(returnIthBit(5, 1));
    }
}