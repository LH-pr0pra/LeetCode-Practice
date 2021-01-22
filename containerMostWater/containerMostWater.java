class Solution {
    public int maxArea(int[] height) {
        //setup for algorithm
        int left = 0;
        int right = height.length - 1;
        int maximum;
        
        //find initial volume along entire list
        if (height[left] > height[right]) {
            maximum = height[right] * (right - left);
        }
        else {
            maximum = height[left] * (right - left);
        }
        
        //iterate until volume = 0
        while (left != right - 1) {
            //move the smaller item
            if (height[left] > height[right]) {
                right -= 1;
            }
            else {
                left += 1;
            }
            int newVol = 0;
            //calculate the new value of volume
            if (height[left] > height[right]) {
                newVol = height[right] * (right - left);
            }
            else {
                newVol = height[left] * (right - left);
            }
            //replace maximum if larger
            if (newVol > maximum) {
                maximum = newVol;
            }
        }
        
        //return
        return maximum;
    }
}