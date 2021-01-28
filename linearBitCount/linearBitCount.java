class Solution {
    public int[] linearBitCount(int num) {
        //given an input, you already know how large the return space must be
        int[] fArray = new int[num + 1];
        //iterate along every item in the return space
        for (int a = 0; a < num + 1; a++) {
            //perform HammingWeight procedure for item
            String bNum = Integer.toBinaryString(a);
            int count = 0;
            for (int b = 0; b < bNum.length(); b++) {
                if (bNum.charAt(b) == '1') {
                    count++;
                }
            }
            //add weight to return space
            fArray[a] = count;
        }
        //return space
        return fArray;
    }
}
//note: from diagnostics, it is slow if functional