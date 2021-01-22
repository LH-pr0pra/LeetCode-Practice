class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = 0;
        int calcBott = numBottles;
        while (calcBott != 0) {
            if (calcBott < numExchange) {
                total += calcBott;
                calcBott = 0;
            }
            else {
                int split = calcBott / numExchange;
                total += (split * numExchange);
                calcBott = calcBott - (split * numExchange) + split;
            }
        }
        return total;
    }
}