public class FindArrayRotation {
    static int findMinimum(int[] a){
        int l = 0;
        int r = a.length -1;
        int ans = 0;
        while (l <= r) {
            //if the part is sorted then store the min and break;
            int mid = l + (r - l)/2;
            if(a[l] < a[r]){
                if(a[l] < a[ans])
                    ans = l;
                break;
            }else if(a[l] <= a[mid]){
                if (a[l] < a[ans]) 
                    ans = l;
                l = mid + 1;
            }else{
                if(a[mid] < a[ans])
                    ans = mid;
                r = mid -1;
            }
        }

        return ans;
    }
     public static void main(String[] args) {
        int[] a = {5, 6, 7, 9, 1, 2};
        System.out.println(findMinimum(a));
     }
}