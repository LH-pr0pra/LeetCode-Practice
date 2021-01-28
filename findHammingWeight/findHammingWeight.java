public class Solution {
    public int hammingWeight(int n) {
        //returns the number of 1s in the binary form of the integer input
        //processes integer as unsigned; given 2s configuration, that doesn't change the process
        String bNum = Integer.toBinaryString(n);
        int count = 0;
        for (int a = 0; a < bNum.length(); a++) {
            if (bNum.charAt(a) == '1') {
                count++;
            }
        }
        return count;
    }
}