class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> mergedIntervals = new LinkedList<int[]>();
        //iterate through intervals by comparing item_i_1 to item_i+1_0
        for (int[] current:intervals) {
            if (mergedIntervals.isEmpty() || (mergedIntervals.getLast()[1] < current[0])) {
                mergedIntervals.add(current);
            }
            else {
                //edit current item
                mergedIntervals.getLast()[1] = Math.max(mergedIntervals.getLast()[1],current[1]);
            }
        }
        int[][] result = mergedIntervals.toArray(new int[mergedIntervals.size()][]);
        return result;
    }
}