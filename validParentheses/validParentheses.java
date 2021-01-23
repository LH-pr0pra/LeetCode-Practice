class Solution {
    public static boolean isValid(String s) {
        Stack<Character> sC = new Stack<Character>();
        //implement checking
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
        return sC.empty();
    }
}