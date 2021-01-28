class Solution {
    public int reverse(int x) {
        //store int x
        int rNum;
        //store negative sign if negative
        boolean neg = false;
        if (x < 0) {
            neg = true;
            rNum = 0 - x;
        }
        else {
            rNum = x;
        }
        //convert rNum to string while reversing
        String reversed = "";
        while (rNum!=0) {
            reversed += (rNum%10);
            rNum /= 10;
        }
        if (neg) {
            reversed = "-" + reversed;
        }
        int fNum = 0;
        //attempt to convert string into int; return exception (0) if not possible
        try {
            fNum = Integer.parseInt(reversed);
        }
        catch (NumberFormatException ex) {
            return 0;
        }
        return fNum;
    }
}