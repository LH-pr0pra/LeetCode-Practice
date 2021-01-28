//DRAFT FOR insertInterval procedure

public static int[][] insert(int[][] intervals, int[] newInterval) {
    //create list like sort&merge program
    LinkedList<int[]> finalIntervals = new LinkedList<int[]>();

    //DEFINING MERGE PROCEDURE
    boolean incorp = false;
    for (int[] current : intervals) {
        if (finalIntervals.isEmpty()) {                
            //compare newInterval and current
                //IF (no overlap) check which is lower
                    //IF current is lower finalIntervals.add(current);
                    //IF newInterval is lower .add(newInterval); incorp = true; .add(current);
                //IF (overlap)
                    //Merge(current,newInterval); incorp = true;
            continue;
        }
        if (!incorp) {
            //compare newInterval and current
                //IF (no overlap) check for lower
                    //IF current is lower Merge(current); continue;
                    //IF newInterval is lower Merge(newInterval); Merge(current); incorp = true; continue;
                //IF (overlap)
                    //incorp = true; Merge(merge(current,newInterval);
            continue;
        }
        //if none of the earlier apply, Merge(current) until end.
    }

    //return procedure
    int[][] result = finalIntervals.toArray(new int[finalIntervals.size()][]);
    return result;//temporary return setup
}