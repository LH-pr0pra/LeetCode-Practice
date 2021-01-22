public class testCase {
    public static int numWaterBottles(int numBott, int numExch) {
        int total = 0;
        int calcBott = numBott;
        while (calcBott != 0) {
            if (calcBott < numExch) {
                total += calcBott;
                calcBott = 0;
            }
            else {
                int split = calcBott / numExch;
                total += (split * numExch);
                calcBott = calcBott - (split * numExch) + split;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("main running\n\n");
        int botTest = numWaterBottles(12, 5);
        System.out.println("12 by 5 = " + botTest);
    }
}