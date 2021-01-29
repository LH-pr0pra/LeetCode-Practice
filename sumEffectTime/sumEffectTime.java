class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        //total value (final item always extends to full time)
        int sumTime = duration;
        //edge case timeSeries.length < 2 or duration = 0
        if (timeSeries.length == 0) {
            return 0;
        }
        //iterate along timeSeries (no need to check the last item in the list)
        for (int i = 0; i < timeSeries.length - 1; i++) {
            sumTime += Math.min(duration,timeSeries[i+1] - timeSeries[i]);
        }
        //return 
        return sumTime;
    }
}