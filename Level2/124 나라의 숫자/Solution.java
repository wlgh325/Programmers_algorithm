class Solution2 {
    public static void main(String[] args){
        int n = 1;
        int n2 = 4;

        System.out.println(solution(12));
    }
    
    public static String solution(int n) {
        StringBuffer sb = new StringBuffer();
        // 3진법 처럼 구하기
        while(n >= 3){
            int remainder = n % 3;
            n /= 3;
            // 나머지가 0이면 4로 바꿔주고 n 감소
            if(remainder == 0){
                n--;
                remainder = 4;
            }
            // 나머지 붙이기
            sb.append(remainder);
        }
        // n이 0이 아닌 경우에만 붙이기
        if(n != 0)
            sb.append(n);
        // 거꾸로 뒤집어 원래대로 만들어 return
        return sb.reverse().toString();
    }
}