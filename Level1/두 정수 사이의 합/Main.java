class Main{
    public static void main(String[] args){
        int a1 = 3, b1 = 5;
        int a2 = 3, b2 = 3;
        int a3 = 5, b3 = 3;

        System.out.println(solution(a1,b1));
        System.out.println(solution(a2,b2));
        System.out.println(solution(a3,b3));
    }

    
    public static long solution(int a, int b) {
        long answer = 0;
        long min = Math.min(a,b);
        long max = Math.max(a,b);
        
        // for 문을 이용해 차례로 더하기
        /*
        for(int i=min; i<=max; i++){
            answer += i;
        }
        */

        // 공식을 이용해 두 수 사이의 합을 구하기
        answer = (min + max) * (max-min+1) /2;
        return answer;
    }
}
