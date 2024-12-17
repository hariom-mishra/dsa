import java.util.Arrays;

public class MajorityElement {
    static int findMajority(int[] ar){
        int count = 0;
        int elem = ar[0];

        for(int i = 0; i < ar.length; i++){
            if(count == 0){
                elem = ar[i];
                count = 1;
            }
            else if(elem == ar[i]){
                count++;
            }else{
                count--;
            }
        }

        return elem;
    }

    static int[] findNBy3(int[] ar){
        int firstElem = Integer.MIN_VALUE;
        int secondElem  = Integer.MAX_VALUE;
        int firstCount = 0;
        int secondCount = 0;

        for(int i = 0; i< ar.length; i++){
            if(ar[i] == firstElem){
                firstCount++;
            } 
            else if(ar[i] == secondElem){
                secondCount++;
            } 
            else if(firstCount == 0){
                firstCount = 1;
                firstElem = ar[i];
            }else if(secondCount == 0){
                secondCount = 1;
                secondElem = ar[i];
            }else{
                firstCount--;
                secondCount--;
            }
        }
        
        return new int[]{firstElem, secondElem};
    }

    public static void main(String[] args) {
        int[] ar = {3, 3, 4, 2, 4, 4, 2, 4};
        System.out.println(findMajority(ar));
        System.out.println(Arrays.toString(findNBy3(ar)));
    }
}
