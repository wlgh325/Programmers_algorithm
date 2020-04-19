class Solution {
    public static void main(String[] args){
        String s = "AB";
        String s2 = "z";
        String s3 = "a B z";

        System.out.println(solution(s, 1));
        System.out.println(solution(s2, 1));
        System.out.println(solution(s3, 4));
    }
    
    public static String solution(String s, int n) {
        char[] arr = s.toCharArray();   // character 배열로 변환

        for(int i=0, len=arr.length; i<len; i++){
            if(arr[i] == ' ')
                continue;

            // 대문자 (65 ~ 90)
            if(arr[i] >=65 && arr[i] <= 90){
                arr[i] += n;
                if(arr[i] > 90)
                    arr[i] -= 26;
            }
            // 소문자( 97 ~ 122)
            else if(arr[i] >= 97 && arr[i] <= 122){
                arr[i] += n;
                if(arr[i] > 122)
                    arr[i] -= 26;
            }
        }

        return String.valueOf(arr); // 문자열로 변환
    }
}