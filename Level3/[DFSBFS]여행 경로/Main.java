import java.util.*;

class Main {
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        String[] ans = solution(tickets);
    }

    static boolean[] visited;
    static String[] select;
    static ArrayList<String> list;
    public static String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        select = new String[tickets.length+1];
        list = new ArrayList<>();

        select[0] = "ICN";
        dfs("ICN", tickets, 1);
        
        String[] ans = new String[list.size()];
        for(int i=0; i<ans.length; i++)
            ans[i] = list.get(i);
        return ans;
    }

    public static void dfs(String start, String[][] tickets, int cnt){
        if(cnt == tickets.length+1){
            // 정답이 아직 구해지지 않은 경우
            if(list.size() == 0){
                for(int i=0; i<select.length; i++)
                    list.add(select[i]);
            }
            else{
                for(int i=1; i<select.length; i++){
                    // 원래 있던게 더 크면 바꿔야 함
                    if(list.get(i).compareTo(select[i]) > 0){
                        list = new ArrayList<>();
                        for(int j=0; j<select.length; j++)
                            list.add(select[j]);
                        break;
                    }
                    // 다른 문자인데 작으면 기존꺼 그대로 둠
                    else if(list.get(i).compareTo(select[i]) < 0)
                        break;
                }
            }
            return;
        }

        for(int i=0; i<tickets.length; i++){
            // 티켓을 사용하지 않았고 티켓의 출발지가 start와 같은 경우
            if(!visited[i] && start.equals(tickets[i][0])){
                visited[i] = true;  // 티켓 사용처리
                select[cnt] = tickets[i][1];    // 그 티켓의 도착지를 select에 담는다
                dfs(tickets[i][1], tickets, cnt+1);
                visited[i] = false;
            }
        }
    }
}