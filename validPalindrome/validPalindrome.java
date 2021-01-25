class Solution {
    public boolean isPalindrome(String s) {
        int lH = 0;
        int rH = s.length() - 1;
        String s2 = s.toLowerCase();
        while ((lH != rH) && (lH < rH)) {
            //iterate along if either is not a character or digit
            if (!Character.isLetterOrDigit(s2.charAt(lH))) {
                lH++;
                continue;
            }
            if (!Character.isLetterOrDigit(s2.charAt(rH))) {
                rH--;
                continue;
            }
            //check
            if (s2.charAt(lH) != s2.charAt(rH)) {
                return false;
            }
            lH++;
            rH--;
        }
        return true;
    }
}