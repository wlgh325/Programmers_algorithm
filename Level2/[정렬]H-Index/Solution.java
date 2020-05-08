import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] citations = {7,7,8,9};
        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        int len = citations.length;
        Arrays.sort(citations); // 오름차순 정렬

        int max = 0;
        int cnt = 0;
        for(int h=0; h<=citations[len-1]; h++){
            // 인용횟수 h보다 큰 인용문의 개수 찾기
            for(int j=0; j<len; j++){
                if(h <= citations[j])
                    cnt++;
            }

            // h보다 큰 인용문의 개수가 h이상이면 max값을 update
            if(cnt >= h)
                max = max < h ? h : max;
            cnt = 0;    // cnt 초기화
        }

        return max;
    }
}