class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        long leftBound = 2;
        long rightBound = x/2;
        while (rightBound != leftBound) {
            long mid = (leftBound + rightBound) / 2;
            if (mid == leftBound) {
                return (int)leftBound;
            }
            if (x > (mid * mid)) {
                leftBound = mid;
            }
            if (x == (mid * mid)) {
                return (int)mid;
            }
            if (x < (mid * mid)) {
                rightBound = mid;
            }
        }
        return (int)leftBound;
    }
}
