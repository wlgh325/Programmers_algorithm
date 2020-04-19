class Solution {
    public static void main(String[] args){
        long n = 12345;
        int[] ans = solution(n);

        // debug
        for(int i=0; i<ans.length; i++)
            System.out.print(ans[i] + " ");
        System.out.println();
    }
    
    public static int[] solution(long n) {
        String s = String.valueOf(n);   // 문자열로 변환
        char[] arr = s.toCharArray();   // 문자 배열로 변환
        
        int len = s.length();   // 문자의 길이
        int[] ans = new int[len];   // return할 배열
        
        for(int i=0; i<len; i++)
            ans[i] = arr[len-1-i] - '0';    // 문자를 숫자로 바꾸어 저장 (문자의 뒤에서 부터)
        return ans;
    }
}