import java.util.*;

class Solution {
    public static void main(String[] args) {
        int brown = 10;
        int red = 2;
        int[] ans = solution(brown, red);

        for(int i=0; i<ans.length; i++)
            System.out.println(ans[i]);;
    }

    public static int[] solution(int brown, int red) {
        int[] answer = {};
        int sum = brown + red;

        for(int i=3; i<=sum; i++){
            // 약수 모두 구하기
            if(sum % i == 0){
                int col = sum / i;
                int row = sum / col;

                int a = col - 2;
                int b = row - 2;
                if(a*b == red && col >= row){
                    return new int[]{col, row};
                }
            }
        }

        return answer;
    }
}