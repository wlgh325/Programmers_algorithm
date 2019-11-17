import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        int n = 5;  // 전체 학생
        int[] lost = {2,4};     // 체육복을 도난당한 번호
        int[] reserve = {1,3,5};    // 체육복 두 벌 있는 번호

        int n2 = 5;
        int[] lost2 = {2,4};
        int[] reserve2 = {3};

        int answer = solution(n, lost, reserve);
        System.out.println(answer);
    }

    // 앞 번호나 뒷 번호에만 빌려줄 수 있음
    // 여벌 체육복이 있는 학생이 도난당했을 수도 있음 -> 이떄 여별이 있어도 빌려줄 수 없음

    
    public static int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n+2];
        int answer = n;
        clothes[0] = -10;
        clothes[n+1] = -10;


        for(int i=0; i<lost.length; i++){
            clothes[lost[i]] -= 1;
        }

        for(int i=0; i<reserve.length; i++){
            clothes[reserve[i]] += 1;
        }

        for(int i=0; i<=n; i++){
            // 체육복이 없다면
            if(clothes[i] == -1){
                // 왼쪽 학생이 여벌 옷이 있다면 빌림
                if(clothes[i-1] == 1){
                    clothes[i-1] -= 1;
                    clothes[i] += 1;
                }
                // 오른쪽 학생이 여별 옷이 있다면 빌림
                else if(clothes[i+1] == 1){
                    clothes[i+1] -= 1;
                    clothes[i] += 1;
                }
                // 빌릴 수 없다면
                else{
                    answer --;
                }
            }
        }

        return answer;
    }
}