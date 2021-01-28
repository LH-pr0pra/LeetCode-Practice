class Solution {
    public boolean isPalindrome(String s) {
        //indexing starts at left and right for palindrome search
        int lH = 0;
        int rH = s.length() - 1;
        //case doesn't matter; toUpperCase has same results
        String s2 = s.toLowerCase();
        //iterate along entire space towards end (while (not (end condition))) {}
        while ((lH != rH) && (lH < rH)) {
            //iterate along if either is not a character or digit (skip that item)
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
                //if false flag hit return false
                return false;
            }
            lH++;
            rH--;
        }
        //if false flag not hit through entire search
        return true;
    }
}