public class ElementOccurrence {
    static int findOccurrence(int[] arr, int x){
        int first = firstOcc(arr, 0, arr.length -1, x);
        int last = lastOCc(arr, 0, arr.length -1, x);
        return last - first + 1;
    }

    static int lastOCc(int[] arr, int l, int h, int x){
        if(h>=l){
            int mid = (l + h) / 2;

            if((mid==arr.length-1 || x < arr[mid+1])){
                return mid;
            }else if(arr[mid] > x){
                return lastOCc(arr, l, mid-1, x);
            }else{
                return lastOCc(arr, mid +1, h, x);
            }
        }
        return -1;
    }

    static int firstOcc(int[] arr, int l, int h, int x) {
        if (h >= l) {
            int mid = (l + h) / 2;

            // Check if the element is present at the middle or
            // if the element is present in the left half (if
            // the element is greater than the middle element)
            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {

                // Search in the right half
                return firstOcc(arr, mid + 1, h, x);
            } else {

                // Search in the left half
                return firstOcc(arr, l, mid - 1, x);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 3, 3, 3, 4, 10};
        System.out.println(findOccurrence(ar, 3));
    }
     
}