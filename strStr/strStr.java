class Solution {
    public int strStr(String haystack, String needle) {
        //edge case
        if (needle.equals("")){
            return 0;
        }
        //normal operation
        else {
            //iterate along potential start space
            for (int i = 0; i < (haystack.length() - needle.length() + 1); i++) {
                //if needle found at index return 1
                if (haystack.substring(i,i+needle.length()).equals(needle)) {
                    return i;
                }
            }
            //search complete; not found
            return -1;
        }   
    }
}
