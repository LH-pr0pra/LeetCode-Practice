class Solution {
    public int reverseBitInteger(int n) {
        int ans = 0;
        for (int a = 0; a < 32; a++) {
            ans <<= 1;
            ans = ans | (n & 1);
            n >>= 1;
        }
        return ans;
    }
}