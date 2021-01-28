class Solution {
    public static boolean isValid(String s) {
        //storage space for search
        Stack<Character> sC = new Stack<Character>();
        //iterate along s
            //if opening character found, add to stack
            //if closing character found, try to match
                //if match, remove match from stack and continue
                //if not match, add to stack
        //if s is VALID, the stack should be empty when s is completely searched
        for (char cN: s.toCharArray()) {
            if (sC.empty()) {
                sC.push(cN);
            }
            else {
                char pullC = sC.peek();
                if ((pullC == '(') && (cN == ')')) {
                    sC.pop();
                }
                else if ((pullC == '{') && (cN == '}')) {
                    sC.pop();
                }
                else if ((pullC == '[') && (cN == ']')) {
                    sC.pop();
                }
                else {
                    sC.push(cN);
                }
            }
        }
        //return
        return sC.empty();
    }
}