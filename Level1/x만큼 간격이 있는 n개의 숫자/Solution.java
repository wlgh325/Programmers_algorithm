class Solution {
    public static void main(String[] args){
        int x = 2;
        int n = 5;

        // debug
        long[] ans = solution(x,n);
        for(int i=0; i<ans.length; i++)
            System.out.print(ans[i] + " ");
        System.out.println();
    }

    public static long[] solution(int x, int n) {
        long xx = x;
        long[] answer = new long[n];
        for(int i=0; i<n; i++)
            answer[i] = xx*(i+1);
        return answer;
    }
}