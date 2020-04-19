import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public static void main(String[] args){
        long n = 1;
        long n2 = 8000000000l;
        // debug
        System.out.println(solution(n));
        System.out.println(solution(n2));
    }
    
    public static long solution(long n) {
        ArrayList<Long> list = new ArrayList<>();
        
        // 각 자릿수 나누어서 list에 저장
        while(n >= 10){
            list.add(n % 10);
            n /= 10;
        }
        list.add(n);

        // 오름차순 정렬
        Collections.sort(list);
        
        // string으로 변환
        StringBuffer sb = new StringBuffer();
        for(int i=list.size()-1; i>=0; i--)
            sb.append(list.get(i));
        // long형 숫자로 변환하여 반환
        return Long.parseLong(sb.toString());
    }
}