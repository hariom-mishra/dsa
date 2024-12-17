package stack;

public class CelebrityProblem {
    static int findCelebs(int[][] ar){
        //elimination
        int top =0;
        int bottom = ar.length - 1;
        while(top < bottom){
            if(ar[top][bottom] == 1) top++;
            else if(ar[bottom][top] == 1) bottom--;
            else{
                top++;
                bottom--;
            }
        }

        //validation
        for(int i = 0; i < ar.length; i++){
            if(ar[top][i] != 0) return -1;
            else if(ar[i][top] == 0 && i != top) return -1; 
        }

        return top;
    }
    
    public static void main(String[] args) {
        int[][] ar = {{0, 1, 1, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(findCelebs(ar));
    }
}
