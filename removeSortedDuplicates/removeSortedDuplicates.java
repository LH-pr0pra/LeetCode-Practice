class Solution {
    public int removeDuplicates(int[] nums) {
        int newLen = 1;
        //edge cases
        if (nums.length < 2) {
            return (nums.length);
        }
        //iterate along nums starting from [1]; skip if current already exists
        for (int i = 1; i < nums.length; i++) {
            //add and reindex if a new value is found; increment newLen
            if (nums[i] != nums[i - 1]) {
                nums[newLen] = nums[i];
                newLen++;
            }
        }
        //return
        return newLen;
    }
}