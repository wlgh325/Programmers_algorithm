class Solution {
    public static void main(String[] args){
        int num = 6;
        int num2 = 16;
        int num3 = 626331;

        // debug
        System.out.println(solution(num));
        System.out.println(solution(num2));
        System.out.println(solution(num3));
    }

    public static int solution(int num) {
        long l = num;   // 계산도중에 int형 범위를 넘을 수 있음
        int cnt = 0;    // 작업 반복 횟수

        while(l != 1){
            // 작업 수행
            if(l % 2 == 0)
                l /= 2;
            else
                l = l*3 + 1;

            cnt++;  // 작업 1회+

            // 1이 된 경우
            if(l == 1)
                break;
            // 500번 해도 1이 안되면 -1
            else if(cnt == 500){
                cnt = -1;
                break;
            }
        }
        return cnt;
    }
}