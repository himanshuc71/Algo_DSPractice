class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0)
            return true;
        
        if (s.length() == 1)
            return false;
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else if (stack.empty() || !check(s.charAt(i), stack.pop()))       // if brackets don't follow then invalid or emptied stack
                return false;
        }
        return stack.empty();
    }
    
    private boolean check (char c1, char c2){
        return (c1 == ')' && c2 == '(') || (c1 == '}' && c2 == '{') || (c1 == ']' && c2 == '[');
    }
}
