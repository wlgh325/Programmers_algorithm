import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        System.out.println(solution(n, computers));
    }

    static boolean[] visited;
    public static int solution(int n, int[][] computers) {
        int ans = 0;

        visited = new boolean[computers.length];
        for(int i=0; i<n; i++){
            if(!visited[i]){
                bfs(i, computers);
                ans++;
            }
        }
        return ans;
    }

    public static void bfs(int a, int[][] computers){
        Queue<Integer> q = new LinkedList<>();
        q.offer(a);
        visited[a] = true;

        while(!q.isEmpty()){
            int x = q.poll();

            for(int i=0; i<computers.length; i++){
                // 방문하지 않았고 연결되어 있고 자기 자신이 아닌 경우
                if(!visited[i] && computers[x][i] == 1 && x != i){
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}