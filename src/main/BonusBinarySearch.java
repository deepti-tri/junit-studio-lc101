package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     * <p>
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n             - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;
        while (right >= left) {
            int mid = left + ((right - left) / 2);
            if (sortedNumbers[mid] > n) {
                right = mid-1;
            } else if (sortedNumbers[mid] < n) {
                left = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
/* [1,3,4,6,12,45], n = 11
* left = 0, right = 5
* 5 >= 0 : mid = 2 : left = 2, right = 5
* 5 >= 2 : mid = 3 : left = 3, right = 5
* 5 >= 3 : mid = 4 : right = 4 left = 3
* 4 >= 3 : mid = 3 : left = 3, right = 4
* */