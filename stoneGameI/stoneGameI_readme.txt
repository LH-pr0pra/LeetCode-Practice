You have an integer array [n] that lists n-piles of stones.
Alex and Lee take turns (Alex first) taking either the first or last pile,
 adding the stones in that pile to their own total.
Return true if Alex has more stones at the end. Otherwise, false.

n is an guaranteed to be an even number, while the total # of stones is odd.

//algorithm below:
If it is possible for Alex to win, Alex will always win.
If Alex takes an odd index stone first, all of the piles Alex collects will
 be ones with odd indexes. If Alex takes the zero-index (even) pile first,
 Alex gets all the even indexes.
Therefore, assuming optimal play, Alex will win.