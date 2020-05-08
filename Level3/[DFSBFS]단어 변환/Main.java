import java.util.*;

class Info{
    String str;
    int stage;

    Info(String str, int stage){
        this.str = str;
        this.stage = stage;
    }
}

class Main {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(solution(begin, target, words));
    }

    static int min;
    public static int solution(String begin, String target, String[] words) {
        int len = words.length;

        // words안에 target word가 없는 경우 0 return
        // 탐색하지 않음
        boolean flag = true;
        for(int i=0; i<len; i++){
            if(words[i].equals(target)){
                flag = false;
                break;
            }
        }
        if(flag)
            return 0;

        min = Integer.MAX_VALUE;
        bfs(begin, target, words, len);
        return min;
    }

    public static void bfs(String begin, String target, String[] words, int len){
        Queue<Info> q = new LinkedList<>();
        boolean[] visited = new boolean[len];
        int wordlen = begin.length();
        q.offer(new Info(begin,0));
        
        while(!q.isEmpty()){
            Info info = q.poll();
            String str = info.str;
            int stage = info.stage;

            // target에 도달한 경우 min 값 갱신
            if(str.equals(target)){
                min = min > stage ? stage : min;
                continue;
            }

            for(int i=0; i<len; i++){
                int cnt = 0;
                // 탐색하지 않은 글자인 경우 탐색
                if(!visited[i]){
                    // 글자 다른지 check
                    for(int j=0; j<wordlen; j++){
                        if(str.charAt(j) == words[i].charAt(j))
                            cnt++;
                    }
                    // 글자 하나만 다른 경우
                    if(cnt == wordlen-1){
                        q.offer(new Info(words[i], stage+1));
                        visited[i] = true;
                    }
                }
            }
        }
    }
}