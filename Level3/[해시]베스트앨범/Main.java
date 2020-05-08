import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class Info {
    int cnt;
    int idx;

    Info(int cnt, int idx) {
        this.cnt = cnt;
        this.idx = idx;
    }
}

class Info2 {
    String genre;
    int num;

    Info2(String genre, int num) {
        this.genre = genre;
        this.num = num;
    }
}

class Main {
    public static void main(String[] args) {
        String[] genres = { "classic", "pop", "classic", "classic", "pop" };
        int[] plays = { 500, 2500, 150, 800, 2500 };
        int[] ans = solution(genres, plays);

        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }

    public static int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map2 = new HashMap<>(); // 장르 별 합
        HashMap<String, ArrayList<Info>> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (map.containsKey(genres[i])) {
                map.get(genres[i]).add(new Info(plays[i], i));
                map2.put(genres[i], map2.get(genres[i]) + plays[i]);
            } else {
                ArrayList<Info> list = new ArrayList<>();
                list.add(new Info(plays[i], i));
                map.put(genres[i], list);
                map2.put(genres[i], plays[i]);
            }
        }

        // 장르별 많은 순 정렬
        ArrayList<Info2> list2 = new ArrayList<>();
        for (String key : map2.keySet())
            list2.add(new Info2(key, map2.get(key)));

        // 장르별 플레이 횟수 내림차순
        // 많은 것 부터 넣기 위해서
        Collections.sort(list2, new Comparator<Info2>() {
            @Override
            public int compare(Info2 a, Info2 b) {
                if (a.num > b.num)
                    return -1;
                else if (a.num < b.num)
                    return 1;
                else
                    return 0;
            }
        });
        
        ArrayList<Integer> ans = new ArrayList<>();
        // 장르별 play횟수가 담겨있는 list를 받아서
        // 플레이 횟수를 내림차순으로 정렬
        // 플레이 횟수가 같으면 index를 오름차순으로 정렬
        for(Info2 info : list2){
            ArrayList<Info> temp = map.get(info.genre);
            Collections.sort(temp, new Comparator<Info>() {
                @Override
                public int compare(Info a, Info b){
                    if(a.cnt > b.cnt)
                        return -1;
                    else if(a.cnt < b.cnt)
                        return 1;
                    else{
                        if(a.idx < b.idx){
                            return -1; 
                        }
                        else if(a.idx > b.idx){
                            return 1;
                        }
                        else
                            return 0;
                    }
                }
            });

            // 장르에 노래가 하나있는 경우에는 하나만 넣기
            if(temp.size() > 1){
                ans.add(temp.get(0).idx);
                ans.add(temp.get(1).idx);
            }
            else
                ans.add(temp.get(0).idx);        
        }

        // 배열로 변환
        int[] answer = new int[ans.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = ans.get(i);
        return answer;
    }
}