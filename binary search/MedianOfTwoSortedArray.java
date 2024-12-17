public class MedianOfTwoSortedArray {
    static int findMedian(int[] a, int[] b) {
        // a should be the sorter array
        if (a.length > b.length)
            return findMedian(b, a);

        int low = 0, high = a.length - 1;
        int len = a.length + b.length;
        int left = (len + 1) / 2;
        while (low <= high) {
            // finding position for the both array
            int mid1 = low + (high - low) / 2;
            int mid2 = left - mid1;

            // finding l1 and l2
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = a[mid1], r2 = Integer.MAX_VALUE;

            if (mid1 - 1 > 0)
                l1 = a[mid1 - 1];
            if (mid2 - 1 > 0)
                l2 = b[mid2 - 1];
            if (mid2 < b.length)
                r2 = b[mid2];

            // checking if the l1 and l2 is on the postion
            if (l1 <= r2 && l2 <= r1) {
                if (len % 2 == 1)
                    return Math.max(l1, l2);
                else
                    return (Math.max(l1, l2) + Math.max(r1, r2)) / 2;
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
        return -1;
    }

    static int findKthElement(int[] a, int[] b, int k){
        // a should be the sorter array
        if (a.length > b.length)
            return findKthElement(b, a, 3);

        int low = Math.max(0, k - b.length), high = Math.min(k, a.length - 1);
        int left = k;
        while (low <= high) {
            // finding position for the both array
            int mid1 = low + (high - low) / 2;
            int mid2 = left - mid1;

            // finding l1 and l2
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = a[mid1], r2 = Integer.MAX_VALUE;

            if (mid1 - 1 > 0)
                l1 = a[mid1 - 1];
            if (mid2 - 1 > 0)
                l2 = b[mid2 - 1];
            if (mid2 < b.length)
                r2 = b[mid2];

            // checking if the l1 and l2 is on the postion
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 7, 10, 12};
        int[] b = {2, 3, 6, 15};

        System.out.println(findMedian(a, b));
        System.out.println(findKthElement(a, b, 3));
    }
}
