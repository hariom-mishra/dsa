public class PascalTriangle {
    static int findNumberAtPostion(int row, int column){
        int ans = 1;
        for(int i= 0; i < column; i++){
            ans = ans * (row -i);
            ans = ans/ (i + 1);
        }
        return ans;
    }
    
    static void nthRow(int n){
        int ans = 1;
        System.out.print(ans+" ");
        for(int i = 0; i < n-1; i++){
            ans = ans * (n - 1 - i);
            ans = ans / (i +1);
            System.out.print(ans+" ");
        }
    }

    static void pascalTriangleGivenRow(int row){
        for(int i = 1; i <= row; i++){
            nthRow(i);
            System.err.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(findNumberAtPostion(10, 3));
        System.err.println();
        nthRow(6);
        System.err.println();
        pascalTriangleGivenRow(3);
    }
}
