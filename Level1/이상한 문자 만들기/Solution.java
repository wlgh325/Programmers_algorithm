class Solution {
    public String solution(String s) {
        String ans = "";
        int idx = 0;
        for(int i=0; i<s.length(); i++){
            if( s.charAt(i) != ' '){
                if( idx % 2 == 0)
                    ans += String.valueOf(s.charAt(i)).toUpperCase();
                else
                    ans += String.valueOf(s.charAt(i)).toLowerCase();
                idx++;
            }
            else{
                ans += " ";
                idx = 0;
            } 
        }
        return ans;
    }
}