import java.util.*;
class Solution {
    public static void main(String[] args){
        int n = 10;
        int n2 = 5;
        System.out.println(solution2(n));
        System.out.println(solution2(n2));
    }

    public static int solution(int n) {
        // 1~N 사이의 소수의 개수
        // N은 1000000이하
        int ans = 0;
        boolean flag;
        for(int i=2; i<=n; i++){
            flag = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = false;
                    break;   
                }
            }
            if(flag)
                ans++;
        }
        return ans;
    }

    public static int solution2(int n) {
        // 에라토스테네스의 체 이용
        boolean[] era = new boolean[n+1];
        ArrayList<Integer> list = new ArrayList<>();    // 소수를 담을 list
        
        for(int i=2; i<=n; i++){
            if(!era[i]){
                list.add(i);
                for(int j=1; i*j<=n; j++)
                    era[i*j] = true;
            }
        }
        
        return list.size();
    }
}