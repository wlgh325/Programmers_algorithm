class Solution {
    public static void main(String[] args){
        int n = 123;
        int n2 = 987;

        System.out.println(solution(n));
        System.out.println(solution(n2));
    }
    
    public static int solution(int n) {
        int ans = 0;
        
        while(true){
            ans += n % 10;
            n /= 10;
            
            if(n<10)
                break;
        }
        ans += n;
        return ans;
    }
}