class Solution {
    public int reverse(int x) {
        int rNum;
        boolean neg = false;
        if (x < 0) {
            neg = true;
            rNum = 0 - x;
        }
        else {
            rNum = x;
        }
        String reversed = "";
        while (rNum!=0) {
            reversed += (rNum%10);
            rNum /= 10;
        }
        if (neg) {
            reversed = "-" + reversed;
        }
        int fNum = 0;
        try {
            fNum = Integer.parseInt(reversed);
        }
        catch (NumberFormatException ex) {
            return 0;
        }
        return fNum;
    }
}