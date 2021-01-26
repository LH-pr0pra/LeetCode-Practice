//complete calculation section
for (int chosen = 0; chosen < aliceValues.length; chosen++) {
    if (aTurn) {
        //alice turn
        int maxI = 0;
        //"sort"
        for (int i = 1; i < aliceValues.length; i++) {
            //remember the maximum index
            if (aliceValues[maxI] + bobValues[maxI] < aliceValues[i] + bobValues[i]) {
                maxI = i;
            }
        }
        //math
        aSum += aliceValues[maxI];
        aliceValues[maxI] = 0;
        bobValues[maxI] = 0;
        aTurn = false;
    }
    else {
        //bob turn
        int maxI = 0;
        //"sort"
        for (int i = 1; i < bobValues.length; i++) {
            //remember the maximum index
            if (aliceValues[maxI] + bobValues[maxI] < aliceValues[i] + bobValues[i]) {
                maxI = i;
            }
        }
        //math
        bSum += bobValues[maxI];
        aliceValues[maxI] = 0;
        bobValues[maxI] = 0;
        aTurn = true;
    }
}