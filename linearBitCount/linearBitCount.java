class Solution {
    public int[] linearBitCount(int num) {
        int[] fArray = new int[num + 1];
        for (int a = 0; a < num + 1; a++) {
            String bNum = Integer.toBinaryString(a);
            int count = 0;
            for (int b = 0; b < bNum.length(); b++) {
                if (bNum.charAt(b) == '1') {
                    count++;
                }
            }
            fArray[a] = count;
        }
        return fArray;
    }
}
//note: from diagnostics, it is slow if functional