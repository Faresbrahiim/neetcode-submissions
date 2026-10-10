class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int left = 0 ; 
        int right = s.length() -1  ;
            // System.out.println("left :" + left) ;
            // System.out.println("right :" + right) ;
        for(int i = 0 ;  i<s.length() ; i++) {
            if(s.charAt(i)=='(') {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)=='[') {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)=='{') {
                // System.out.println("");
                stack.push(s.charAt(i));
            }
                        if((s.charAt(i)== '}'||s.charAt(i)== ')'|| s.charAt(i)== ']') && stack.isEmpty()) {
                return false;
            }
            if(s.charAt(i)=='}') {
                if(stack.pop() != '{') {
                    System.out.println("4");
                    return false; 
                }
            }
            if(s.charAt(i)==']') {
                if(stack.pop() != '[') {
                // System.out.println("HEERE MOTHERFOCKER");
                    return false; 
                }
            }
            if(s.charAt(i)==')') {
                if(stack.pop() != '(') {
                // System.out.println("2");
                    return false; 
                }
            }
        }
        if(!stack.isEmpty()) {
            return false ;
        }
        return true;
    }
}
