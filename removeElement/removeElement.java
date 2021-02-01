class Solution {
    public int removeElement(int[] nums, int val) {
        int x = 0;
        int newLen = nums.length;
        while (x < newLen) {
            //every time you find val, increment rep and deincrement newLen
            if (nums[x] == val) {
                nums[x] = nums[newLen - 1];
                newLen--;
            }
            else {
                x++;
            }
        }
        return newLen;
    }
}