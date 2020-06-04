import java.util.*;

class Solution {
    public static void main(String[] args) {
        String s = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";
        if(solution(s))
            System.out.println("True");
        else
            System.out.println("false");
    }

    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        char[] chs = s.toCharArray();
        
        for(int i=0, size=chs.length; i<size; i++){
            switch(chs[i]){
                case '(':
                    stack.push(chs[i]);
                    break;
                case ')':
                    if(stack.size() != 0)
                        stack.pop();
                    else
                        return false;
                    break;
            }
        }
        
        if(stack.size() != 0)
            return false;
        return answer;
    }
}