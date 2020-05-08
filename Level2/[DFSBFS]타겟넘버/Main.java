class Main {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        System.out.println(solution(numbers, target));
    }

    static boolean[] visited;
    static int cnt;
    static int[] copy;
    static int len;
    public static int solution(int[] numbers, int target) {
        len = numbers.length;
        
        cnt = 0;
        // comb함수에서 사용하기 위해 static으로 뺴놓기
        copy = new int[len];
        for(int i=0; i<len; i++)
            copy[i] = numbers[i];

        // len개 중 1,...len개 선택하는 조합 모두 구하기
        for(int i=1; i<=len; i++){
            visited = new boolean[len];
            comb(0, i, len, target);
        }
        return cnt;
    }

    public static void comb(int start, int r, int n, int target){
        if(start == r){
            int sum =0; //  계산한 결과
            
            // 선택한 숫자는 +, 선택하지 않는 숫자는 - 계산
            for(int i=0; i<len; i++){
                if(visited[i])
                    sum += copy[i];
                else
                    sum -= copy[i];
            }

            // 계산 결과가 target과 같다면 cnt 증가
            if(sum == target)
                cnt++;
            return;
        }

        // 조합 찾기
        for(int i=start; i<n; i++){
            visited[i] = true;
            comb(i+1, r, n, target);
            visited[i] = false;
        }
    }
}