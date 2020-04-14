import java.util.*;
class Solution {
    public static void main(String[] args){
        String s = "pPoooyY";

        System.out.println(solution(s));
    }
    
    public static boolean solution(String s) {
        int p = 0;
        int y = 0;
        char[] chs = s.toLowerCase().toCharArray();
        for(int i=0; i<chs.length; i++){
            if(chs[i] == 'p')
                p++;
            else if(chs[i] == 'y')
                y++;
        }

        if(p == y)
            return true;
        else
            return false;
    }
}