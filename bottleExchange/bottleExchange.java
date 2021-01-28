class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        //storage
        int total = 0;
        //non-dynamic program (so we copy numBottles for a flexible count)
        int calcBott = numBottles;
        //until the pile is empty
        while (calcBott != 0) {
            //if you know you won't get any exchanges from empty to full done
            if (calcBott < numExchange) {
                total += calcBott;
                calcBott = 0;
            }
            //drink a multiple of numExchange and add the new filled bottles to your pile
            else {
                int split = calcBott / numExchange;
                total += (split * numExchange);
                calcBott = calcBott - (split * numExchange) + split;
            }
        }
        //return value
        return total;
    }
}