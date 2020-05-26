import java.util.Comparator;
import java.util.PriorityQueue;

class Info implements Comparable<Info>{
    int rqTime;
    int finish;

    Info(int rqTime, int finish){
        this.rqTime = rqTime;
        this.finish = finish;
    }

    @Override
    public int compareTo(Info a){
        if(this.rqTime > a.rqTime)
            return 1;
        else if(this.rqTime < a.rqTime)
            return -1;
        else{
            if(this.finish > a.finish)
                return 1;
            else if(this.finish < a.finish)
                return -1;
            else
                return 0;
        }
    }
}

class Main {
    public static void main(String[] args) {
        int[][] jobs = {{0,3}, {1,9}, {2,6}};   // 답 : 9
        int[][] jobs2 = {{0,3}, {1,9}, {500,6}};    // 답 : 6
        System.out.println(solution(jobs));
        System.out.println(solution(jobs2));
    }

    public static int solution(int[][] jobs) {
        int ans = 0;
        int end = 0;
        PriorityQueue<Info> pq = new PriorityQueue<>();    
        PriorityQueue<Info> pq2 = new PriorityQueue<>(new Comparator<Info>() {
            public int compare(Info a, Info b){
                return a.finish - b.finish;
            }
        });
        
        // 요청시간순 오름차순, 요청시간이 같은 경우 작업 소요시간 오름차순
        for(int i=0; i<jobs.length; i++)
            pq.offer(new Info(jobs[i][0], jobs[i][1]));

        while(!pq.isEmpty() || !pq2.isEmpty()){
            // 앞의 작업을 수행하느라 수행하지 못한 작업을 pq2에 넣기
            while(!pq.isEmpty()){
                if(end >= pq.peek().rqTime)
                    pq2.offer(pq.poll());
                else
                    break;
            }

            // 보류된 작업이 없는 경우
            if(pq2.isEmpty()){
                // 요청 시간이 제일 빠른 작업 수행
                Info info = pq.poll();
                ans += info.finish; // 보류되지 않았으므로 작업의 소요시간 만큼 걸림
                end = info.rqTime + info.finish;    // 끝난시간 = 요청시간 + 작업의 소요시간
            }
            else{
                // 보류된 작업 중 가장 빨리 끝낼 수 있는 작업부터 시행
                Info info = pq2.poll();
                ans += end - info.rqTime + info.finish; // 보류된 시간(end - info.rqTime) + 작업 소유시간(info.finish)
                end += info.finish; // 끝난 시간 = 이전 끝난시간 + 작업 소요시간
            }
        }
        return (int)ans/jobs.length;
    }
}