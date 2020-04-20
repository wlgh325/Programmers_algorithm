class Solution {
    public static void main(String[] args){
        int n = 121;
        int n2 = 3;

        System.out.println(solution(n));
        System.out.println(solution(n2));
    }
    
    public static long solution(long n) {
        double a = Math.sqrt(n);
        if(a - Math.floor(a) == 0){
            long b = (long)(a+1);
            return (long)Math.pow(b,2);
        }
        else
            return -1;
    }
}