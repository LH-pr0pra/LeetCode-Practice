class Solution {
    public int mySqrt(int x) {
        //edge case x<2
        if (x < 2) {
            return x;
        }
        //set up bounds for search; long for extra control beyond int limits
        long leftBound = 2;
        long rightBound = x/2;
        while (rightBound != leftBound) {
            //"binary search" for sqrt(x), using leftBound; narrow space until only 1 remains
            long mid = (leftBound + rightBound) / 2;
            if (mid == leftBound) {
                return (int)leftBound;
            }
            if (x > (mid * mid)) {
                leftBound = mid;
            }
            if (x == (mid * mid)) {
                //if search lands exactly on sqrt(x), return it
                return (int)mid;
            }
            if (x < (mid * mid)) {
                rightBound = mid;
            }
        }
        //integer return result
        return (int)leftBound;
    }
}
