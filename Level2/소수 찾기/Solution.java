import java.util.HashSet;

class Solution {
    public static void main(String[] args){
        String numbers = "17";
        String numbers2 = "011";

        System.out.println(solution(numbers));
        System.out.println(solution(numbers2));
    }

    static boolean[] visited;
    static int ans;
    static char[] chs;
    static char[] select;   // 순열
    static HashSet<Integer> set;    // 소수 저장 (중복 제거)
    public static int solution(String numbers){
        chs = numbers.toCharArray();

        int size = numbers.length();
        visited = new boolean[size];

        ans = 0;
        set = new HashSet<>();
        // 1,2,...size개 모든 경우 순열 구하기
        // 1Psize, 2Psize, ..sizePsize
        for(int i=1; i<=size; i++){
            select = new char[i];
            perm(0, i, size);
        }

        return set.size();
    }

    public static void perm(int start, int r, int n){
        if(start == r){
            // 숫자로 변환
            String str = "";
            for(int i=0; i<select.length; i++)
                str += select[i];
            int num = Integer.parseInt(str);

            // 예외 처리
            if(num == 1 || num == 0)
                return;

            // 소수 인지 검사
            boolean flag = false;
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num % i == 0)
                    flag = true;
            }

            if(!flag)
                set.add(num);
            return;
        }

        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                select[start] = chs[i];
                perm(start+1, r, n);
                visited[i] = false;
            }
        }
    }
}