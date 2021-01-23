public class Solution {
    public int hammingWeight(int n) {
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