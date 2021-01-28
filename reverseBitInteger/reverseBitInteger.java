class Solution {
    public int reverseBitInteger(int n) {
        //empty return space
        int ans = 0;
        //integer in 32-bit form, so iterate over entire section
        for (int a = 0; a < 32; a++) {
            //place item in return space
            ans <<= 1;
            //item along space n
            ans = ans | (n & 1);
            n >>= 1;
        }
        //return answer
        return ans;
    }
}