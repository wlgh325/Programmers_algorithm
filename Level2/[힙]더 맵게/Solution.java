import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] scoville = {0,0,0};
        int K = 7;
        System.out.println(solution(scoville, K));
    }

    public static int solution(int[] scoville, int K) {
        int cnt = 0;
        // 우선순위 큐 생성해서 값 집어 넣기
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++)
            q.offer(scoville[i]);

        // queue에 2개 이상이 남아있는 경우만 합칠 수 있음 -> 마지막 두개 합쳐서 K이상이 될 수도 있음
        // queue 맨 앞의 원소가 K 이상이면 나머지 원소도 K 이상임
        while(q.size() > 1 && q.peek() < K){
            int first = q.poll();
            int second = q.poll();
            q.offer(first + second*2);
            cnt++;
        }

        // {0,0,0}, 7 인 경우 queue에 남아 있는 마지막 수가 K보다 작은 경우
        // 반복해서 K이상으로 만들 수 없는 경우임 => -1 return
        if(q.peek() < K)
            cnt = -1;
        return cnt;
    }
}