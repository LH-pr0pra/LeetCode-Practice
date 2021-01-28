class Solution {
    public boolean canArrange(int[] arr, int k) {
        //Use modulo arithmetic to determine the remainders of each item divided by k
            //pair up the remainders that add up to k; if they're unequal, it's false
            //check for numbers that are multiples of k; if that # isn't even, it's false
            //if k is even check for the center where k/2 is the remainder; if this is odd, it's false
            //else return true
        //create array (length k; equivalent to indexes)
        int[] tracker = new int[k];
        Arrays.fill(tracker,0);
        //iterate through arr, adding each value along ^ deciding using modulo k
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i] % k;
            while (j < 0) {
                j+=k;
            }
            tracker[j]++;
        }
        //check zero item in array
        if (tracker[0] % 2 != 0) {
            return false;
        }
        //check if there's a center item in k (if k%2 == 0)
        if ((k % 2 == 0) && (tracker[k/2] % 2 != 0)) {
            return false;
        }
        //check pairs along k
        int lH = 1;
        int rH = k - 1;
        while (lH < rH) {
            if (tracker[lH] != tracker[rH]) {
                return false;
            }
            lH++;
            rH--;
        }
        return true;
    }
}