class Solution {
    public static void main(String[] args){
        int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};

        System.out.println(solution(baseball));
    }

    public static int solution(int[][] baseball){
        int ans = 0;
        // i를 정답인 수라고 가정하고 check
        for(int i=123; i<=987; i++){
            String n = String.valueOf(i / 100);
            String n2 = String.valueOf((i/10) % 10);
            String n3 = String.valueOf(i % 10);

            // 숫자가 모두 달라야 함
            if(n.equals(n2) || n.equals(n3) || n2.equals(n3))
                continue;
            // 0이 포함되면 안됨
            if(n.equals("0") || n2.equals("0") || n3.equals("0"))
                continue;

            boolean flag = true;
            for(int j=0; j<baseball.length; j++){
                int num = baseball[j][0];
                int strike = baseball[j][1];
                int ball = baseball[j][2];
    
                char[] compare = String.valueOf(i).toCharArray();
                char[] numc = String.valueOf(num).toCharArray();

                int estimate_strike = 0;
                int estimate_ball = 0;

                // i 숫자와 상대가 질문한 숫자 비교wa
                for(int k=0; k<3; k++){
                    for(int t=0; t<3; t++){
                        // k와 t는 자리수를 나타냄
                        // 위치도 같고 숫자도 같으면 strike
                        if(k == t && compare[k] == numc[t]){
                            estimate_strike++;
                            continue;
                        }
                        // 숫자만 같으면 ball
                        else if(compare[k] == numc[t]){
                            estimate_ball++;
                            continue;
                        }
                    }
                }

                // 예상한 ball과 strike에 맞지 않는 경우
                // 가능한 숫자가 아님
                if(estimate_ball != ball || estimate_strike != strike){
                    flag = false;
                    break;
                }
            }

            // 질의한 숫자의 ball, strike에 모두 맞은 경우에만 가능한 숫자로 판단!!
            if(flag)
                ans++;
        }

        return ans;
    }
}