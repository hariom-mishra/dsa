public class FindElementInRoatedSortedArray {
    static int findElement(int[] ar, int elem){
        int pos = -1;
        int l = 0, r = ar.length -1;
        while (l <= r) {
            int mid = (l + r)/2;
            if(ar[mid] == elem){
                return mid;
            }else if(elem > ar[mid]){
                if(elem > ar[ar.length -1] && ar[mid] <= ar[ar.length -1]){
                    r = mid -1;
                }else{
                    l = mid + 1;
                }
            }else{
                if(elem < ar[0] && ar[mid] >= ar[ar.length -1]){
                    l = mid + 1;
                }else{
                    r = mid -1;
                }
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] ar = {3, 3, 3, 1, 2, 3};
        int elem = 1;
        System.out.println(findElement(ar, elem));

    }
}
