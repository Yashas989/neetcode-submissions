class Solution {
    public boolean isValid(String s) {
        if(s == null || s.isEmpty() || s.length() == 1)
            return false;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(Character c : chars){
            switch (c){
                case '{','[','(': stack.push(c); break;
                case '}' :
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }
                    else
                        return false;
                    break;
                case ')' :
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }
                    else
                        return false;
                    break;
                case ']' :
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }
                    else
                        return false;
                    break;

            }
        }
        return stack.isEmpty();
    }
}
