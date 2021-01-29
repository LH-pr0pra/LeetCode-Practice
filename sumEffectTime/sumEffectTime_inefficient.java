class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        //total value (final item always extends to full time)
        int sumTime = duration;
        //edge case timeSeries.length < 2 or duration = 0
        if (timeSeries.length == 1) {
            return sumTime;
        }
        if (timeSeries.length == 0) {
            return 0;
        }
        //iterate along timeSeries (no need to check the last item in the list)
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int n = timeSeries[i+1] - timeSeries[i];
            //if overlap add only difference, else add full duration
            if (n < duration) {
                sumTime += n;
            }
            else {
                sumTime += duration;
            }
        }
        //return 
        return sumTime;
    }
}
//slow and greedy solution